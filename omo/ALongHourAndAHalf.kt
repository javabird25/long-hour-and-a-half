/*
 * ALongHourAndAHalf Vers. 1.3
 *
 * Dev: Rosalie Elodie, JavaBird
 *
 * Version History:
 * 0.1    Default game mechanics shown, non interactable. No playability, no customization. Not all game mechanics even implemented, purely a showcase program.
 * 0.2    MASSIVE REWRITE! (Thanks to Anna May! This is definitely the format I want!)
 * 1.0    Added interactivity, improved code, added hardcore mode(this isn't working now) and... cheats!
 * 1.1    Reintegrated the two versions
 * 1.2    New hardcore features:
 *            Classmates can be aware that you've to go
 *            Less bladder capacity
 *        Improved bladder: it's more realistic now
 *        Balanced pee holding methods
 *        New game options frame
 *        Even more clothes
 *        Cleaned and documented code a bit
 * 1.3    Bug fixes
 *        Interface improvements
 *        Game text refining
 * 1.3.1  Bug fixes
 * 1.4    Character can drink during the class
 *        Saving/loading games
 *        Bug fixes
 * 1.4.1  Bug fixes
 *
 * A Long Hour and a Half (ALongHourAndAHalf) is a game where
 * one must make it through class with a rather full bladder.
 * This game will be more of a narrative game, being extremely text based,
 * but it will have choices that can hurt and help your ability to hold.
 * Some randomization elements are going to be in the game, but until completion,
 * it's unknown how many.
 *
 * Many options are already planned for full release, such as:
 * Name (friends and teacher may say it. Also heard in mutterings if an accident occurs)
 * Male and Female (only affects character.gender pronouns (yes, that means crossdressing's allowed!))
 * Random bladder amount upon awaking (Or preset)
 * Choice of clothing (or, if in a rush, random choice of clothing (will be "character.gender conforming" clothing)
 * Ability to add positives (relative to holding capabilities)
 * Ability to add negatives (relative to holding capabilities)
 * Called upon in class if unlucky (every 15 minutes)
 * Incontinence (continence?) level selectable (multiplier basis. Maybe just presets, but having ability to choose may also be nice).
 *
 *
 * Other options, which may be added in later or not, are these:
 * Extended game ("Can [name] get through an entire school day AND make it home?") (probably will be in the next update)
 * Better Dialog (lines made by someone that's not me >_< )
 * Story editor (players can create their own stories and play them)
 * Wear editor (players can create their own wear types and use it in A Long hour and a Half and custom stories
 * Save/load game states
 * Character presets
 *
 *
 * If you have any questions, bugs or suggestions,
 * create an issue or a pull request on GitHub:
 * https://github.com/javabird25/long-hour-and-a-half/
 *
 * Developers' usernames table
 *    Code documentation  |GitHub                                      |Omorashi.org
 *    --------------------|--------------------------------------------|---------------------------------------------------------------------
 *    Rosalie Elodie      |REDev987532 (https://github.com/REDev987532)|Justice (https://www.omorashi.org/profile/25796-justice/)
 *    JavaBird            |javabird25 (https://github.com/javabird25)  |FromRUSForum (https://www.omorashi.org/profile/89693-fromrusforum/)
 *    Anna May            |AnnahMay (https://github.com/AnnahMay)      |Anna May (https://www.omorashi.org/profile/10087-anna-may/)
 *    notwillnotcast      |?                                           |thisonestays (https://www.omorashi.org/profile/14935-thisonestays/)
 *
 * FINAL NOTE: While this is created by Rosalie Dev, she allows it to be posted
 * freely, so long as she's creditted. She also states that this program is
 * ABSOLUTELY FREE, not to mention she hopes you enjoy ^_^
 *
 *
 * DEV NOTES: Look for bugs, there is always a bunch of them
 */
package omo

import omo.Wear.WearType.*
import omo.ui.GameFrame
import omo.ui.GameOverDialog
import omo.ui.SchoolSetup
import java.awt.Color
import java.io.*
import java.util.*
import javax.swing.JFileChooser
import javax.swing.JOptionPane

@Suppress("UNCHECKED_CAST")
fun <T> File.userObject() = ObjectInputStream(FileInputStream(this)).readObject() as T

/**
 * Main game class.
 *
 * @author Rosaile Elodie, JavaBird, Anna May, notwillnotcast
 */
class ALongHourAndAHalf {
    constructor(save: Save) {
        state = save.gameState
        scorer = save.scorer
        stageMap = StageMap(this)

        parametersStorage = Save(this)
        gameFrame = GameFrame(this)
        currentStage = save.stage
        gameFrame.isVisible = true
    }

    var state: GameState

    val random = Random()

    val stageMap: StageMap

    /**
     * A stage after the current stage.
     */
    var currentStage: Stage

    /**
     * Maximal time without squirming and leaking.
     */
    //var character.bladder.gameState.fullness.maximalSphincterStrength = 100 / character.bladder.gameState.fullness.incontinence

    val parametersStorage: Save

    var scorer = Scorer()

    val gameFrame: GameFrame

    constructor(parameters: GameStartData) {
        this.state = GameState(
                CharacterGameState(
                        parameters.character!!,
                        BladderGameState(
                                parameters.character!!.bladder,
                                parameters.fullness!!
                        ),
                        WearGameState(
                                parameters.undies!!,
                                parameters.lower!!,
                                parameters.undiesColor!!,
                                parameters.lowerColor!!
                        )
                ),
                parameters.hardcore!!
        )

        gameFrame = GameFrame(this)

        handleSpecialWear(UNDERWEAR)
        handleSpecialWear(OUTERWEAR)

        //Scoring bladder fullness at start
        scorer += state.characterState.bladderState.fullness.toInt()

        //Scoring incontinence
        scorer += state.characterState.character.bladder.incontinence.toInt()

        if (state.hardcore) {
            scorer.addFinalMultiplier(2)
        }

        displayAllGameStateValues()

        //TODO("Move to state behaviour")
        //Making bladder smaller in the hardcore mode, adding hardcore label
        if (state.hardcore) {
            //TODO: state.characterState.bladderState.maximalFullness = 100.0
            gameFrame.lblName.text = gameFrame.lblName.text + " [Hardcore]"
        }

        parametersStorage = Save(this)

        stageMap = StageMap(this)

        //Starting the game
        currentStage = stageMap[StageID.LEAVE_BED]!!
        handleNextClicked()
        gameFrame.isVisible = true
    }

    //TODO: Fix the action processing, implement RPG elements
    internal fun handleNextClicked() {
        advanceToNextStage()
        currentStage.operations()
        updateUIForNewStage()
    }

    private fun updateUIForNewStage() {
        val actions = currentStage.actions
        if (!actions.isEmpty()) {
            gameFrame.lblChoice.text = currentStage.actionGroupName
            gameFrame.listChoice.setListData(actions.toTypedArray())
            gameFrame.listChoice.isVisible = true
        } else
            gameFrame.listChoice.isVisible = false

        setText(currentStage.text)
    }

    private fun advanceToNextStage() {
        val actions = currentStage.actions
        val selectedAction = (gameFrame.listChoice.selectedValue as? Action)?.stage
        val selectedActionStage = if (selectedAction == null)
            null
        else
            stageMap[selectedAction]
        val nextStageID = currentStage.nextStage
        val nextStage = if (nextStageID != null)
            stageMap[nextStageID]
        else
            null
        when {
            nextStage == null && actions.isEmpty() ->
                gameFinished()
            actions.isEmpty() && nextStage != null ->
                currentStage = nextStage
            !actions.isEmpty() ->
                if (currentStage.nextStagePriority == Stage.NextStagePriority.ACTION)
                    currentStage = selectedActionStage ?: nextStage ?: currentStage
                else
                    currentStage = nextStage ?: selectedActionStage ?: currentStage
        }
    }

    private fun gameFinished() {
        gameFrame.btnNext.isEnabled = false
        GameOverDialog(state.characterState.character, scorer.score)
        TODO()
    }

    private fun handleSpecialWear(type: Wear.WearType) {
        val state = state.characterState
        var targetWear = when (type) {
            UNDERWEAR -> state.wearState.undies
            OUTERWEAR -> state.wearState.lower
            BOTH_SUITABLE -> throw IllegalArgumentException("BOTH_SUITABLE argument isn't supported")
        }

        when (targetWear.name) {
            "No underwear" -> {
                targetWear.insertName = if (state.character.gender == Gender.FEMALE) {
                    "crotch"
                } else {
                    "penis"
                }
            }
            "Random" -> {    //TODO: Gender-conforming random
                targetWear = randomWear(type)
            }
            "Custom" -> {
                val fc = WearFileChooser()
                fc.showOpenDialog(gameFrame)
                try {
                    val wear: Wear = fc.selectedFile.userObject()
                    if (wear.type == OUTERWEAR) {   //TODO: Move validation to SchoolSetup
                        JOptionPane.showMessageDialog(gameFrame, "Incorrect wear type.", null, JOptionPane.ERROR_MESSAGE)
                        gameFrame.dispose()
                        SchoolSetup(state.character)
                    } else {
                        state.wearState.undies = wear
                    }
                } catch (e: Exception) {
                    JOptionPane.showMessageDialog(gameFrame, "File error.\nRandom wear will be selected.", null, JOptionPane.ERROR_MESSAGE)
                    state.wearState.undies = randomWear(UNDERWEAR)
                }
            }
        }

        when (type) {
            UNDERWEAR -> state.wearState.undies = targetWear
            OUTERWEAR -> state.wearState.lower = targetWear
            BOTH_SUITABLE -> throw IllegalArgumentException("BOTH_SUITABLE argument isn't supported")
        }
    }

    private fun randomWear(type: Wear.WearType): Wear {
        when (type) {
            UNDERWEAR -> return Wear.underwearList[Random().nextInt(Wear.underwearList.size - 3) + 3]   //First 3 wear list indices are special
            OUTERWEAR -> return Wear.outerwearList[Random().nextInt(Wear.outerwearList.size - 3) + 3]
            BOTH_SUITABLE -> throw IllegalArgumentException("BOTH_SUITABLE argument isn't supported")
        }
    }

    fun getBladderStatus(): Stage.Text = when (state.characterState.bladderState.fullness) {
        in 0..20 -> Stage.Text(
                Stage.Text.Line("Feeling bored about the day, and not really caring about the class too much,"),
                Stage.Text.Line("you look to the clock, watching the minutes tick by.")
        )
        in 21..40 -> Stage.Text(
                Stage.Text.Line("Having to pee a little bit,"),
                Stage.Text.Line("you look to the clock, watching the minutes tick by and wishing the lesson to get over faster.")
        )
        in 41..60 -> Stage.Text(
                Stage.Text.Line("Clearly having to pee,"),
                Stage.Text.Line("you impatiently wait for the lesson end.")
        )
        in 61..80 -> Stage.Text(
                Stage.Text.Line("You feel the rather strong pressure in your bladder, and you're starting to get even more desperate."),
                Stage.Text.Line("Maybe I should ask teacher to go to the restroom? It hurts a bit...", true)
        )
        in 81..100 -> Stage.Text(
                Stage.Text.Line("Keeping all that urine inside will become impossible very soon.", true),
                Stage.Text.Line("You feel the terrible pain and pressure in your bladder, and you can almost definitely say you haven't needed to pee this badly in your life."),
                Stage.Text.Line("Ouch, it hurts a lot... I must do something about it now, or else...")
        )
        in 101..Int.MAX_VALUE ->
            Stage.Text(
                    Stage.Text.Line("This is really bad...", true),
                    Stage.Text.Line("You know that you can't keep it any longer and you may wet yourself in any moment and oh,"),
                    Stage.Text.Line("You can clearly see your bladder as it bulging."),
                    Stage.Text.Line("Ahhh... I cant hold it anymore!", true),
                    Stage.Text.Line(if (state.characterState.character.gender == Gender.FEMALE)
                        "Even holding your crotch doesn't seems to help you to keep it in."
                    else
                        "Even squeezing your penis doesn't seems to help you to keep it in.")
            )
        else -> throw IllegalStateException("Bladder fullness isn't in the legal range (0..${Int.MAX_VALUE}: " +
                state.characterState.bladderState.fullness)
    }

    private fun displayAllGameStateValues() {
        gameFrame.lblMinutes.isVisible = true
        gameFrame.lblSphPower.isVisible = true
        gameFrame.lblDryness.isVisible = true
        gameFrame.sphincterBar.isVisible = true
        gameFrame.drynessBar.isVisible = true
        gameFrame.timeBar.isVisible = true
    }

    /**
     * Increments the time by specified amount of minutes and all time-related parameters.
     *
     * @param time amount of time increasement
     */
    fun passTime(time: Int = 3) {
        offsetTime(time)
        offsetBladder(time * 1.5)
        offsetBelly(-time * 1.5)

        testWet()

        //Decrementing sphincter power for every 3 minutes
        for (i in 0..time - 1) {
            decaySphPower()
            if (state.characterState.belly != 0.0) {
                if (state.characterState.belly > 3) {
                    offsetBladder(2.0)
                } else {
                    offsetBladder(state.characterState.belly)
                    emptyBelly()
                }
            }
        }
        if (state.hardcore) {
            state.characterState.thirst += 2
            if (state.characterState.thirst > CharacterGameState.MAXIMAL_THIRST) {
                currentStage = stageMap[StageID.DRINK] ?: throw StageNotFoundException(StageID.DRINK)
            }
        }
        //Updating labels
        updateUI()
    }

    /**
     * Checks the wetting conditions, and if they are met, wetting
     */
    fun testWet() {
        //If bladder is filled more than 130 points in the normal mode and 100 points in the hardcore mode, forcing wetting
        if ((state.characterState.bladderState.fullness >= state.characterState.character.bladder.maximalFullness) && !state.hardcore) {
            state.characterState.bladderState.sphincterStrength = 0.0
            if (state.characterState.wearState.dryness < MINIMAL_DRYNESS) {
                if (state.specialHardcoreStage) {
                    currentStage = stageMap[StageID.SURPRISE_ACCIDENT] ?: throw StageNotFoundException(StageID.SURPRISE_ACCIDENT)
                } else {
                    currentStage = stageMap[StageID.ACCIDENT] ?: throw StageNotFoundException(StageID.ACCIDENT)
                }
            }
        } else
        //If bladder is filled more than 100 points in the normal mode and 50 points in the hardcore mode, character has a chance to wet
        {
            if ((state.characterState.bladderState.fullness > state.characterState.bladderState.bladder.maximalFullness - 30) && !state.hardcore
                    || ((state.characterState.bladderState.fullness > state.characterState.bladderState.bladder.maximalFullness - 20) && state.hardcore)) {
                if (!state.hardcore) {
                    val wetChance = (3 * (state.characterState.bladderState.fullness - 100) + state.characterState.embarrassment)
                    if (random.nextInt(100) < wetChance) {
                        state.characterState.bladderState.sphincterStrength = 0.0
                        if (state.characterState.wearState.dryness < MINIMAL_DRYNESS) {
                            if (state.specialHardcoreStage) {
                                currentStage = stageMap[StageID.SURPRISE_ACCIDENT] ?: throw StageNotFoundException(StageID.SURPRISE_ACCIDENT)
                            } else {
                                currentStage = stageMap[StageID.ACCIDENT] ?: throw StageNotFoundException(StageID.ACCIDENT)
                            }
                        }
                    }
                } else {
                    val wetChance = (5 * (state.characterState.bladderState.fullness - 80))
                    if (random.nextInt(100) < wetChance) {
                        state.characterState.bladderState.sphincterStrength = 0.0
                        if (state.characterState.wearState.dryness < MINIMAL_DRYNESS) {
                            if (state.specialHardcoreStage) {
                                currentStage = stageMap[StageID.SURPRISE_ACCIDENT] ?: throw StageNotFoundException(StageID.SURPRISE_ACCIDENT)
                            } else {
                                currentStage = stageMap[StageID.ACCIDENT] ?: throw StageNotFoundException(StageID.ACCIDENT)
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Empties the bladder.
     */
    fun emptyBladder() {
        state.characterState.bladderState.fullness = 0.0
        updateUI()
    }

    /**
     * Offsets bladder fulness by a specified amount.
     *
     * @param amount the amount to offset bladder fulness
     */
    fun offsetBladder(amount: Double) {
        state.characterState.bladderState.fullness += amount
        if (state.characterState.bladderState.fullness > 100 && !state.hardcore
                || state.characterState.bladderState.fullness > 80 && state.hardcore) {
            gameFrame.lblBladder.foreground = Color.RED
        } else {
            gameFrame.lblBladder.foreground = Color.BLACK
        }
        updateUI()
    }

    /**
     * Empties the character.gameState.belly.
     */
    fun emptyBelly() {
        offsetBelly(-state.characterState.belly)
    }

    fun offsetBelly(amount: Double) {
        state.characterState.belly += amount
        if (state.characterState.belly < 0) {
            state.characterState.belly = 0.0
        }
        updateUI()
    }

    fun offsetEmbarassment(amount: Int) {
        state.characterState.embarrassment += amount.toShort()
        if (state.characterState.embarrassment < 0) {
            state.characterState.embarrassment = 0
        }
        updateUI()
    }

    fun offsetTime(amount: Int) {
        state.lesson.time += amount
        //Clothes drying over lesson.time
        if (state.characterState.wearState.dryness < state.characterState.wearState.lower.absorption + state.characterState.wearState.undies.absorption) {
            state.characterState.wearState.dryness += state.characterState.wearState.lower.dryingOverTime + state.characterState.wearState.undies.dryingOverTime * (amount / 3)
        }

        if (state.characterState.wearState.dryness > state.characterState.wearState.lower.absorption + state.characterState.wearState.undies.absorption) {
            state.characterState.wearState.dryness = state.characterState.wearState.lower.absorption + state.characterState.wearState.undies.absorption
        }
        updateUI()
    }

    /**
     * Decreases the sphincter power.
     */
    fun decaySphPower() {
        state.characterState.bladderState.sphincterStrength -= (state.characterState.bladderState.fullness / 30).toShort()
        if (state.characterState.bladderState.sphincterStrength < 0) {
            state.characterState.wearState.dryness -= 5 //Decreasing dryness
            state.characterState.bladderState.fullness -= 2.5 //Decreasing bladder level
            state.characterState.bladderState.sphincterStrength = 0.0
            if (state.characterState.wearState.dryness > MINIMAL_DRYNESS) {
                setText(Stage.Text(
                        Stage.Text.Line(when (state.characterState.wearState.wearMode) {
                            Wear.Mode.BOTH,
                            Wear.Mode.LOWER -> "You see the wet spot expand on your ${state.characterState.wearState.lower.insert()}!"
                            Wear.Mode.UNDIES -> "You see the wet spot expand on your ${state.characterState.wearState.undies.insert()}!"
                            Wear.Mode.NONE -> "You feel the leak running down your thighs..."
                        }),
                        Stage.Text.Line("You're about to pee! You must stop it!")
                ))
            } else {
                setText(when (state.characterState.wearState.wearMode) {
                    Wear.Mode.BOTH,
                    Wear.Mode.LOWER -> Stage.Text(
                            Stage.Text.Line("You see the wet spot expanding on your ${state.characterState.wearState.lower.insert()}!"),
                            Stage.Text.Line("It's too much...")
                    )
                    Wear.Mode.UNDIES -> Stage.Text(
                            Stage.Text.Line("You see the wet spot expanding on your ${state.characterState.wearState.undies.insert()}!"),
                            Stage.Text.Line("It's too much...")
                    )
                    Wear.Mode.NONE -> if (state.characterState.cornered) {
                        Stage.Text(
                                Stage.Text.Line("You see a puddle forming on the floor beneath you, you're peeing!"),
                                Stage.Text.Line("It's too much...")
                        )
                    } else {
                        Stage.Text(
                                Stage.Text.Line("Feeling the pee hit the chair and soon fall over the sides,"),
                                Stage.Text.Line("you see a puddle forming under your chair, you're peeing!"),
                                Stage.Text.Line("It's too much...")
                        )
                    }
                })
            }
            currentStage = stageMap[StageID.ACCIDENT] ?:
                    throw StageNotFoundException(StageID.ACCIDENT)
            handleNextClicked()
            updateUI()
        }
    }

    /**
     * Replenishes the sphincter power.
     *
     * @param amount the sphincter recharge amount
     */
    fun rechargeSphPower(amount: Int) {
        state.characterState.bladderState.sphincterStrength += amount
        if (state.characterState.bladderState.sphincterStrength > state.characterState.bladderState.bladder.maximalSphincterStrength) {
            state.characterState.bladderState.sphincterStrength = state.characterState.bladderState.bladder.maximalSphincterStrength
        }
        updateUI()
    }

    /**
     * Sets the in-game text.
     *
     * @param text the in-game text to set
     */
    private fun setText(text: Stage.Text) {
        class InvalidTextException : Exception("Attempt to set more than $MAX_LINES or less than 0 lines at a time")

        if (text.lines.size !in 0..9) {
            throw InvalidTextException()
        }

        var toSend = "<html><center>"

        for (i in text.lines) {
            if (i.italic) {
                toSend += "<i>\"" + i.line + "\"</i>"
            } else {
                toSend += i.line
            }
            toSend += "<br>"
        }
        toSend += "</center></html>"
        gameFrame.textLabel.text = toSend
    }

    internal fun updateUI() {
        gameFrame.lblName.text = state.characterState.character.name
        gameFrame.lblBladder.text = "Bladder: ${Math.round(state.characterState.bladderState.fullness)}%"
        gameFrame.lblEmbarrassment.text = "Embarassment: ${state.characterState.embarrassment}"
        gameFrame.lblBelly.text = "Belly: ${Math.round(state.characterState.belly)}%"
        gameFrame.lblIncontinence.text = "Incontinence: ${state.characterState.bladderState.bladder.incontinence}x"
        gameFrame.lblMinutes.text = "Minutes: ${state.lesson.time} of 90"
        gameFrame.lblSphPower.text = "Pee holding ability: ${state.characterState.bladderState.sphincterStrength.toInt()}%"
        gameFrame.lblDryness.text = "Clothes character.gameState.dryness: ${state.characterState.wearState.dryness.toInt()}"
        gameFrame.lblUndies.text = "Undies: ${state.characterState.wearState.undiesColor} ${state.characterState.wearState.undies.name.toLowerCase()}"
        gameFrame.lblLower.text = "Lower: ${state.characterState.wearState.lowerColor} ${state.characterState.wearState.lower.name.toLowerCase()}"
        gameFrame.bladderBar.value = state.characterState.bladderState.fullness.toInt()
        gameFrame.sphincterBar.value = state.characterState.bladderState.sphincterStrength.toInt()
        gameFrame.drynessBar.value = state.characterState.wearState.dryness.toInt()
        gameFrame.timeBar.value = state.lesson.time.toInt()
        gameFrame.lblThirst.text = "Thirst: ${state.characterState.thirst}%"
        gameFrame.thirstBar.value = state.characterState.thirst.toInt()
    }

    internal fun save() {
        gameFrame.fcGame.selectedFile = File(state.characterState.character.name)
        if (gameFrame.fcGame.showSaveDialog(gameFrame) == JFileChooser.APPROVE_OPTION) {
            try {
                val file = File(gameFrame.fcGame.selectedFile.absolutePath + ".lhhsav")
                val fos = FileOutputStream(file)
                val oos = ObjectOutputStream(fos)
                oos.writeObject(Save(this))
            } catch (e: IOException) {
                e.printStackTrace()
                JOptionPane.showMessageDialog(gameFrame, "File error.", "Error", JOptionPane.ERROR_MESSAGE)
            }
        }
    }

    internal fun load() {
        TODO()
    }

    /**
     * Resets the game and values, optionally letting player to select new
     * parameters.
     *
     * @param newValues
     */
    fun reset(state: GameState, newValues: Boolean) {
        if (newValues) {
            SchoolSetup(state.characterState.character)
        } else {
            gameFrame.dispose()
            ALongHourAndAHalf(parametersStorage)    //TODO
        }
    }

    companion object {
        //Maximal lines of a text
        private const val MAX_LINES = 9

        /**
         * The dryness game over minimal threshold.
         */
        const val MINIMAL_DRYNESS = 0

        const val ACTION_BUTTONS_HEIGHT = 35
        const val ACTION_BUTTONS_WIDTH = 89
        const val ACTION_BUTTONS_TOP_BORDER = 510
    }
}