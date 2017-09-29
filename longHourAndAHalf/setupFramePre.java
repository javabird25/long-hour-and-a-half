package longHourAndAHalf;

import longHourAndAHalf.ALongHourAndAHalf.Gender;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Random;

/**
 * @author JavaBird
 */
public class setupFramePre extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    JFileChooser fcWear;
    JFileChooser fcGame;
    Save game;
    private String undiesColor = "Random";
    private String lowerColor = "Random";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JSlider basSlider;
    private JRadioButton basSliderRadio;
    private JLabel bladAtStartLabel;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private JPanel difficultyPanel;
    private JRadioButton femaleRadio;
    private JRadioButton hardDiffRadio;
    private JLabel incontLabel;
    private JSlider incontSlider;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTextPane jTextPane1;
    private JButton loadGame;
    private JPanel lowerColor_black1;
    private JPanel lowerColor_blue1;
    private JPanel lowerColor_darkBlue1;
    private JPanel lowerColor_gray1;
    private JPanel lowerColor_green1;
    private JPanel lowerColor_orange1;
    private JPanel lowerColor_pink1;
    private JPanel lowerColor_purple1;
    private JPanel lowerColor_random1;
    private JPanel lowerColor_red1;
    private JPanel lowerColor_yellow1;
    private JRadioButton maleRadio;
    private JTextField nameField;
    private JLabel nameLabel;
    private JRadioButton normalDiffRadio;
    private JLabel outerwearLabel;
    private JTree outerwearTree;
    private JRadioButton randomBasSlider;
    private JButton start;
    private JLabel underwearLabel;
    private JTree underwearTree;
    private JPanel undiesColor_black;
    private JPanel undiesColor_blue;
    private JPanel undiesColor_darkBlue;
    private JPanel undiesColor_gray;
    private JPanel undiesColor_green;
    private JPanel undiesColor_orange;
    private JPanel undiesColor_pink;
    private JPanel undiesColor_purple;
    private JPanel undiesColor_random;
    private JPanel undiesColor_red;
    private JPanel undiesColor_yellow;
    private JButton wearEditorButton;

    /**
     * Creates new form setupFrame
     */
    public setupFramePre() {
        fcWear = new JFileChooser();
        fcWear.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                String extension = "";
                int i = f.getName().lastIndexOf('.');
                if (i > 0) {
                    extension = f.getName().substring(i + 1);
                }
                return extension.equals("lhhwear");
            }

            @Override
            public String getDescription() {
                return "A Long Hour and a Half Saved game";
            }
        });

        fcGame = new JFileChooser();
        fcGame.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                String extension = "";
                int i = f.getName().lastIndexOf('.');
                if (i > 0) {
                    extension = f.getName().substring(i + 1);
                }
                return extension.equals("lhhsav");
            }

            @Override
            public String getDescription() {
                return "A Long Hour and a Half Saved game";
            }
        });
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setupFramePre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new setupFramePre().setVisible(true);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        nameField = new JTextField();
        maleRadio = new JRadioButton();
        femaleRadio = new JRadioButton();
        difficultyPanel = new JPanel();
        normalDiffRadio = new JRadioButton();
        hardDiffRadio = new JRadioButton();
        incontLabel = new JLabel();
        incontSlider = new JSlider();
        bladAtStartLabel = new JLabel();
        basSlider = new JSlider();
        underwearLabel = new JLabel();
        outerwearLabel = new JLabel();
        start = new JButton();
        nameLabel = new JLabel();
        basSliderRadio = new JRadioButton();
        randomBasSlider = new JRadioButton();
        jScrollPane1 = new JScrollPane();
        underwearTree = new JTree();
        jScrollPane2 = new JScrollPane();
        outerwearTree = new JTree();
        jScrollPane3 = new JScrollPane();
        jTextPane1 = new JTextPane();
        undiesColor_black = new JPanel();
        undiesColor_gray = new JPanel();
        undiesColor_red = new JPanel();
        undiesColor_orange = new JPanel();
        undiesColor_yellow = new JPanel();
        undiesColor_green = new JPanel();
        undiesColor_blue = new JPanel();
        undiesColor_darkBlue = new JPanel();
        undiesColor_purple = new JPanel();
        undiesColor_pink = new JPanel();
        lowerColor_pink1 = new JPanel();
        lowerColor_black1 = new JPanel();
        lowerColor_gray1 = new JPanel();
        lowerColor_red1 = new JPanel();
        lowerColor_orange1 = new JPanel();
        lowerColor_yellow1 = new JPanel();
        lowerColor_green1 = new JPanel();
        lowerColor_blue1 = new JPanel();
        lowerColor_darkBlue1 = new JPanel();
        lowerColor_purple1 = new JPanel();
        undiesColor_random = new JPanel();
        lowerColor_random1 = new JPanel();
        wearEditorButton = new JButton();
        loadGame = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nameField.setText("Mrs. Nobody");
        nameField.setToolTipText("Your character's name");
        nameField.setName("nameField"); // NOI18N

        buttonGroup1.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.setName("maleRadio"); // NOI18N
        maleRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(femaleRadio);
        femaleRadio.setSelected(true);
        femaleRadio.setText("Female");
        femaleRadio.setName("femaleRadio"); // NOI18N
        femaleRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        difficultyPanel.setBorder(BorderFactory.createTitledBorder("Difficulty"));
        difficultyPanel.setToolTipText("");
        difficultyPanel.setName("difficultyPanel"); // NOI18N

        buttonGroup2.add(normalDiffRadio);
        normalDiffRadio.setSelected(true);
        normalDiffRadio.setText("Normal");
        normalDiffRadio.setName("normalDiffRadio"); // NOI18N
        normalDiffRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                normalDiffRadioActionPerformed(evt);
            }
        });

        buttonGroup2.add(hardDiffRadio);
        hardDiffRadio.setText("Hardcore");
        hardDiffRadio.setToolTipText("<html>\nTeacher never lets you pee<br>\nHarder to hold pee<br>\nYou may get caught holding pee<br>\n<i>Thirst</i> parameter\n</html>");
        hardDiffRadio.setName("hardDiffRadio"); // NOI18N

        GroupLayout difficultyPanelLayout = new GroupLayout(difficultyPanel);
        difficultyPanel.setLayout(difficultyPanelLayout);
        difficultyPanelLayout.setHorizontalGroup(difficultyPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(difficultyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(normalDiffRadio, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(100, 100, 100)
                        .addComponent(hardDiffRadio)
                        .addContainerGap())
        );
        difficultyPanelLayout.setVerticalGroup(difficultyPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(difficultyPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(normalDiffRadio)
                        .addComponent(hardDiffRadio))
        );

        incontLabel.setText("Incontinence");
        incontLabel.setToolTipText("How incontinent are you?");
        incontLabel.setName("incontLabel"); // NOI18N

        incontSlider.setMinimum(5);
        incontSlider.setToolTipText("How incontinent are you?");
        incontSlider.setValue(10);
        incontSlider.setName("incontSlider"); // NOI18N

        bladAtStartLabel.setText("Bladder at start");
        bladAtStartLabel.setToolTipText("How much you have to pee on wake?");
        bladAtStartLabel.setName("bladAtStartLabel"); // NOI18N

        basSlider.setToolTipText("Defined value");
        basSlider.setValue(0);
        basSlider.setName("basSlider"); // NOI18N

        underwearLabel.setText("Underwear:");
        underwearLabel.setToolTipText("Select your underwear");
        underwearLabel.setName("underwearLabel"); // NOI18N

        outerwearLabel.setText("Outerwear:");
        outerwearLabel.setToolTipText("Select your outerwear");
        outerwearLabel.setName("outerwearLabel"); // NOI18N

        start.setFont(new Font("sansserif", 1, 12)); // NOI18N
        start.setText("Start");
        start.setToolTipText("Start new game");
        start.setName("start"); // NOI18N
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        nameLabel.setFont(new Font("sansserif", 1, 12)); // NOI18N
        nameLabel.setText("Name");
        nameLabel.setName("nameLabel"); // NOI18N

        buttonGroup3.add(basSliderRadio);
        basSliderRadio.setToolTipText("Defined value");
        basSliderRadio.setName("basSliderRadio"); // NOI18N
        basSliderRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                basSliderRadioActionPerformed(evt);
            }
        });

        buttonGroup3.add(randomBasSlider);
        randomBasSlider.setSelected(true);
        randomBasSlider.setText("Random");
        randomBasSlider.setToolTipText("Random value between 0% and 100%");
        randomBasSlider.setName("randomBasSlider"); // NOI18N
        randomBasSlider.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                randomBasSliderActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode treeNode2 = new DefaultMutableTreeNode("Random");
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("Female");
        DefaultMutableTreeNode treeNode3 = new DefaultMutableTreeNode("Panties");
        DefaultMutableTreeNode treeNode4 = new DefaultMutableTreeNode("Strings");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Tanga panties");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Regular panties");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("\"Boy shorts\" panties");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Swimwear");
        treeNode4 = new DefaultMutableTreeNode("String bikini");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Regular bikini");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Swimsuit");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Diapers");
        treeNode4 = new DefaultMutableTreeNode("Light diaper");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Normal diaper");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Heavy diaper");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Menstrual pads");
        treeNode4 = new DefaultMutableTreeNode("Light pad");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Normal pad");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Big pad");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("Male");
        treeNode3 = new DefaultMutableTreeNode("Pants");
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Shorts-alike pants");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("Special");
        treeNode3 = new DefaultMutableTreeNode("Anti-gravity pants");
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Super-absorbing diaper");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("No underwear");
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("Custom");
        treeNode1.add(treeNode2);
        underwearTree.setModel(new DefaultTreeModel(treeNode1));
        underwearTree.setName("underwearTree"); // NOI18N
        underwearTree.setRootVisible(false);
        jScrollPane1.setViewportView(underwearTree);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        treeNode1 = new DefaultMutableTreeNode("root");
        treeNode2 = new DefaultMutableTreeNode("Random");
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("Female");
        treeNode3 = new DefaultMutableTreeNode("Jeans");
        treeNode4 = new DefaultMutableTreeNode("Long jeans");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Knee-length jeans");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Short jeans");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Very short jeans");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Trousers");
        treeNode4 = new DefaultMutableTreeNode("Long trousers");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Knee-length trousers");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Short trousers");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Very short trousers");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Skirts");
        treeNode4 = new DefaultMutableTreeNode("Long skirt");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Knee-length skirt");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Short skirt");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Mini skirt");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Micro skirt");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Long skirt and tights");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Knee-length skirt and tights");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Short skirt and tights");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Mini skirt and tights");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Micro skirt and tights");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Leggings");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("Male");
        treeNode3 = new DefaultMutableTreeNode("Jeans");
        treeNode4 = new DefaultMutableTreeNode("Short male jeans");
        treeNode3.add(treeNode4);
        treeNode4 = new DefaultMutableTreeNode("Normal male jeans");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new DefaultMutableTreeNode("Male trousers");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("No outerwear");
        treeNode1.add(treeNode2);
        treeNode2 = new DefaultMutableTreeNode("Custom");
        treeNode1.add(treeNode2);
        outerwearTree.setModel(new DefaultTreeModel(treeNode1));
        outerwearTree.setName("outerwearTree"); // NOI18N
        outerwearTree.setRootVisible(false);
        jScrollPane2.setViewportView(outerwearTree);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jTextPane1.setText("This program is thanks to the wonderful help of the following users:\nAnna May, FromRUSForum, and notwillnotcast of Omo.org, and two others (who choose to not be credited for differing reasons —\n                                            helping a ton, along with a few others helping with my minor mistakes!\n\nIf your (user)name is not here and you want it here, just shoot me a message and I'll add it post-haste!");
        jTextPane1.setName("creditsPane"); // NOI18N
        jScrollPane3.setViewportView(jTextPane1);

        undiesColor_black.setBackground(new Color(0, 0, 0));
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        undiesColor_black.setToolTipText("Black");
        undiesColor_black.setName("undiesColor_black"); // NOI18N
        undiesColor_black.setPreferredSize(new Dimension(20, 20));
        undiesColor_black.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_blackMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_blackLayout = new GroupLayout(undiesColor_black);
        undiesColor_black.setLayout(undiesColor_blackLayout);
        undiesColor_blackLayout.setHorizontalGroup(undiesColor_blackLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_blackLayout.setVerticalGroup(undiesColor_blackLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_gray.setBackground(new Color(153, 153, 153));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_gray.setToolTipText("Gray");
        undiesColor_gray.setName("undiesColor_gray"); // NOI18N
        undiesColor_gray.setPreferredSize(new Dimension(20, 20));
        undiesColor_gray.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_grayMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_grayLayout = new GroupLayout(undiesColor_gray);
        undiesColor_gray.setLayout(undiesColor_grayLayout);
        undiesColor_grayLayout.setHorizontalGroup(undiesColor_grayLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_grayLayout.setVerticalGroup(undiesColor_grayLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_red.setBackground(new Color(255, 0, 0));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_red.setToolTipText("Red");
        undiesColor_red.setName("undiesColor_red"); // NOI18N
        undiesColor_red.setPreferredSize(new Dimension(20, 20));
        undiesColor_red.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_redMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_redLayout = new GroupLayout(undiesColor_red);
        undiesColor_red.setLayout(undiesColor_redLayout);
        undiesColor_redLayout.setHorizontalGroup(undiesColor_redLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_redLayout.setVerticalGroup(undiesColor_redLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_orange.setBackground(new Color(255, 153, 0));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_orange.setToolTipText("Orange");
        undiesColor_orange.setName("undiesColor_orange"); // NOI18N
        undiesColor_orange.setPreferredSize(new Dimension(20, 20));
        undiesColor_orange.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_orangeMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_orangeLayout = new GroupLayout(undiesColor_orange);
        undiesColor_orange.setLayout(undiesColor_orangeLayout);
        undiesColor_orangeLayout.setHorizontalGroup(undiesColor_orangeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_orangeLayout.setVerticalGroup(undiesColor_orangeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_yellow.setBackground(new Color(255, 255, 0));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_yellow.setToolTipText("Yellow");
        undiesColor_yellow.setName("undiesColor_yellow"); // NOI18N
        undiesColor_yellow.setPreferredSize(new Dimension(20, 20));
        undiesColor_yellow.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_yellowMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_yellowLayout = new GroupLayout(undiesColor_yellow);
        undiesColor_yellow.setLayout(undiesColor_yellowLayout);
        undiesColor_yellowLayout.setHorizontalGroup(undiesColor_yellowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_yellowLayout.setVerticalGroup(undiesColor_yellowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_green.setBackground(new Color(0, 255, 0));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_green.setToolTipText("Green");
        undiesColor_green.setName("undiesColor_green"); // NOI18N
        undiesColor_green.setPreferredSize(new Dimension(20, 20));
        undiesColor_green.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_greenMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_greenLayout = new GroupLayout(undiesColor_green);
        undiesColor_green.setLayout(undiesColor_greenLayout);
        undiesColor_greenLayout.setHorizontalGroup(undiesColor_greenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_greenLayout.setVerticalGroup(undiesColor_greenLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_blue.setBackground(new Color(0, 255, 204));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_blue.setToolTipText("Blue");
        undiesColor_blue.setName("undiesColor_blue"); // NOI18N
        undiesColor_blue.setPreferredSize(new Dimension(20, 20));
        undiesColor_blue.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_blueMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_blueLayout = new GroupLayout(undiesColor_blue);
        undiesColor_blue.setLayout(undiesColor_blueLayout);
        undiesColor_blueLayout.setHorizontalGroup(undiesColor_blueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_blueLayout.setVerticalGroup(undiesColor_blueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_darkBlue.setBackground(new Color(0, 0, 204));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_darkBlue.setToolTipText("Dark blue");
        undiesColor_darkBlue.setName("undiesColor_darkBlue"); // NOI18N
        undiesColor_darkBlue.setPreferredSize(new Dimension(20, 20));
        undiesColor_darkBlue.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_darkBlueMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_darkBlueLayout = new GroupLayout(undiesColor_darkBlue);
        undiesColor_darkBlue.setLayout(undiesColor_darkBlueLayout);
        undiesColor_darkBlueLayout.setHorizontalGroup(undiesColor_darkBlueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_darkBlueLayout.setVerticalGroup(undiesColor_darkBlueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_purple.setBackground(new Color(153, 0, 153));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_purple.setToolTipText("Purple");
        undiesColor_purple.setName("undiesColor_purple"); // NOI18N
        undiesColor_purple.setPreferredSize(new Dimension(20, 20));
        undiesColor_purple.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_purpleMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_purpleLayout = new GroupLayout(undiesColor_purple);
        undiesColor_purple.setLayout(undiesColor_purpleLayout);
        undiesColor_purpleLayout.setHorizontalGroup(undiesColor_purpleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_purpleLayout.setVerticalGroup(undiesColor_purpleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_pink.setBackground(new Color(255, 51, 255));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        undiesColor_pink.setToolTipText("Pink");
        undiesColor_pink.setName("undiesColor_pink"); // NOI18N
        undiesColor_pink.setPreferredSize(new Dimension(20, 20));
        undiesColor_pink.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_pinkMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_pinkLayout = new GroupLayout(undiesColor_pink);
        undiesColor_pink.setLayout(undiesColor_pinkLayout);
        undiesColor_pinkLayout.setHorizontalGroup(undiesColor_pinkLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        undiesColor_pinkLayout.setVerticalGroup(undiesColor_pinkLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_pink1.setBackground(new Color(255, 51, 255));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_pink1.setToolTipText("Pink");
        lowerColor_pink1.setName("lowerColor_pink1"); // NOI18N
        lowerColor_pink1.setPreferredSize(new Dimension(20, 20));
        lowerColor_pink1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_pink1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_pink1Layout = new GroupLayout(lowerColor_pink1);
        lowerColor_pink1.setLayout(lowerColor_pink1Layout);
        lowerColor_pink1Layout.setHorizontalGroup(lowerColor_pink1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_pink1Layout.setVerticalGroup(lowerColor_pink1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_black1.setBackground(new Color(0, 0, 0));
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        lowerColor_black1.setToolTipText("Black");
        lowerColor_black1.setName("lowerColor_black1"); // NOI18N
        lowerColor_black1.setPreferredSize(new Dimension(20, 20));
        lowerColor_black1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_black1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_black1Layout = new GroupLayout(lowerColor_black1);
        lowerColor_black1.setLayout(lowerColor_black1Layout);
        lowerColor_black1Layout.setHorizontalGroup(lowerColor_black1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_black1Layout.setVerticalGroup(lowerColor_black1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_gray1.setBackground(new Color(153, 153, 153));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_gray1.setToolTipText("Gray");
        lowerColor_gray1.setName("lowerColor_gray1"); // NOI18N
        lowerColor_gray1.setPreferredSize(new Dimension(20, 20));
        lowerColor_gray1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_gray1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_gray1Layout = new GroupLayout(lowerColor_gray1);
        lowerColor_gray1.setLayout(lowerColor_gray1Layout);
        lowerColor_gray1Layout.setHorizontalGroup(lowerColor_gray1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_gray1Layout.setVerticalGroup(lowerColor_gray1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_red1.setBackground(new Color(255, 0, 0));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_red1.setToolTipText("Red");
        lowerColor_red1.setName("lowerColor_red1"); // NOI18N
        lowerColor_red1.setPreferredSize(new Dimension(20, 20));
        lowerColor_red1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_red1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_red1Layout = new GroupLayout(lowerColor_red1);
        lowerColor_red1.setLayout(lowerColor_red1Layout);
        lowerColor_red1Layout.setHorizontalGroup(lowerColor_red1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_red1Layout.setVerticalGroup(lowerColor_red1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_orange1.setBackground(new Color(255, 153, 0));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_orange1.setToolTipText("Orange");
        lowerColor_orange1.setName("lowerColor_orange1"); // NOI18N
        lowerColor_orange1.setPreferredSize(new Dimension(20, 20));
        lowerColor_orange1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_orange1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_orange1Layout = new GroupLayout(lowerColor_orange1);
        lowerColor_orange1.setLayout(lowerColor_orange1Layout);
        lowerColor_orange1Layout.setHorizontalGroup(lowerColor_orange1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_orange1Layout.setVerticalGroup(lowerColor_orange1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_yellow1.setBackground(new Color(255, 255, 0));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_yellow1.setToolTipText("Yellow");
        lowerColor_yellow1.setName("lowerColor_yellow1"); // NOI18N
        lowerColor_yellow1.setPreferredSize(new Dimension(20, 20));
        lowerColor_yellow1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_yellow1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_yellow1Layout = new GroupLayout(lowerColor_yellow1);
        lowerColor_yellow1.setLayout(lowerColor_yellow1Layout);
        lowerColor_yellow1Layout.setHorizontalGroup(lowerColor_yellow1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_yellow1Layout.setVerticalGroup(lowerColor_yellow1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_green1.setBackground(new Color(0, 255, 0));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_green1.setToolTipText("Green");
        lowerColor_green1.setName("lowerColor_green1"); // NOI18N
        lowerColor_green1.setPreferredSize(new Dimension(20, 20));
        lowerColor_green1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_green1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_green1Layout = new GroupLayout(lowerColor_green1);
        lowerColor_green1.setLayout(lowerColor_green1Layout);
        lowerColor_green1Layout.setHorizontalGroup(lowerColor_green1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_green1Layout.setVerticalGroup(lowerColor_green1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_blue1.setBackground(new Color(0, 255, 204));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_blue1.setToolTipText("Blue");
        lowerColor_blue1.setName("lowerColor_blue1"); // NOI18N
        lowerColor_blue1.setPreferredSize(new Dimension(20, 20));
        lowerColor_blue1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_blue1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_blue1Layout = new GroupLayout(lowerColor_blue1);
        lowerColor_blue1.setLayout(lowerColor_blue1Layout);
        lowerColor_blue1Layout.setHorizontalGroup(lowerColor_blue1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_blue1Layout.setVerticalGroup(lowerColor_blue1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_darkBlue1.setBackground(new Color(0, 0, 204));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_darkBlue1.setToolTipText("Dark blue");
        lowerColor_darkBlue1.setName("lowerColor_darkBlue1"); // NOI18N
        lowerColor_darkBlue1.setPreferredSize(new Dimension(20, 20));
        lowerColor_darkBlue1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_darkBlue1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_darkBlue1Layout = new GroupLayout(lowerColor_darkBlue1);
        lowerColor_darkBlue1.setLayout(lowerColor_darkBlue1Layout);
        lowerColor_darkBlue1Layout.setHorizontalGroup(lowerColor_darkBlue1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_darkBlue1Layout.setVerticalGroup(lowerColor_darkBlue1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        lowerColor_purple1.setBackground(new Color(153, 0, 153));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        lowerColor_purple1.setToolTipText("Purple");
        lowerColor_purple1.setName("lowerColor_purple1"); // NOI18N
        lowerColor_purple1.setPreferredSize(new Dimension(20, 20));
        lowerColor_purple1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_purple1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_purple1Layout = new GroupLayout(lowerColor_purple1);
        lowerColor_purple1.setLayout(lowerColor_purple1Layout);
        lowerColor_purple1Layout.setHorizontalGroup(lowerColor_purple1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );
        lowerColor_purple1Layout.setVerticalGroup(lowerColor_purple1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 18, Short.MAX_VALUE)
        );

        undiesColor_random.setBackground(new Color(204, 204, 204));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        undiesColor_random.setToolTipText("Random");
        undiesColor_random.setName("undiesColor_random"); // NOI18N
        undiesColor_random.setPreferredSize(new Dimension(20, 20));
        undiesColor_random.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                undiesColor_randomMouseClicked(evt);
            }
        });

        GroupLayout undiesColor_randomLayout = new GroupLayout(undiesColor_random);
        undiesColor_random.setLayout(undiesColor_randomLayout);
        undiesColor_randomLayout.setHorizontalGroup(undiesColor_randomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 14, Short.MAX_VALUE)
        );
        undiesColor_randomLayout.setVerticalGroup(undiesColor_randomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 14, Short.MAX_VALUE)
        );

        lowerColor_random1.setBackground(new Color(204, 204, 204));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        lowerColor_random1.setToolTipText("Random");
        lowerColor_random1.setName("lowerColor_random1"); // NOI18N
        lowerColor_random1.setPreferredSize(new Dimension(20, 20));
        lowerColor_random1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lowerColor_random1MouseClicked(evt);
            }
        });

        GroupLayout lowerColor_random1Layout = new GroupLayout(lowerColor_random1);
        lowerColor_random1.setLayout(lowerColor_random1Layout);
        lowerColor_random1Layout.setHorizontalGroup(lowerColor_random1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 14, Short.MAX_VALUE)
        );
        lowerColor_random1Layout.setVerticalGroup(lowerColor_random1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 14, Short.MAX_VALUE)
        );

        wearEditorButton.setText("Wear editor");
        wearEditorButton.setToolTipText("Create your own wear and use it in game.");
        wearEditorButton.setName("wearEditorButton"); // NOI18N
        wearEditorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                wearEditorButtonActionPerformed(evt);
            }
        });

        loadGame.setText("Load game...");
        loadGame.setToolTipText("Load a paused game");
        loadGame.setName("loadGame"); // NOI18N
        loadGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loadGameActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(nameField)
                                                                .addComponent(difficultyPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(nameLabel)
                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                        .addGap(5, 5, 5))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(underwearLabel)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(6, 6, 6)
                                                                        .addComponent(undiesColor_black, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_gray, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_red, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_orange, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_yellow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_green, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_blue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_darkBlue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_purple, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(undiesColor_pink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(undiesColor_random, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(basSliderRadio)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(basSlider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(randomBasSlider))
                                                .addComponent(jScrollPane2)
                                                .addComponent(incontSlider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(femaleRadio)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(maleRadio))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(outerwearLabel)
                                                                .addComponent(incontLabel)
                                                                .addComponent(bladAtStartLabel)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(lowerColor_black1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_gray1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_red1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_orange1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_yellow1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_green1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_blue1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_darkBlue1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_purple1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lowerColor_pink1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(lowerColor_random1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(loadGame, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(start, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wearEditorButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameLabel)
                                        .addGap(8, 8, 8)
                                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(difficultyPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(underwearLabel)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(femaleRadio)
                                                .addComponent(maleRadio))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bladAtStartLabel)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(basSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(basSliderRadio)
                                                .addComponent(randomBasSlider))
                                        .addGap(8, 8, 8)
                                        .addComponent(incontLabel)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(incontSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outerwearLabel)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(undiesColor_black, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_gray, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_red, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_orange, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_green, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_blue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_darkBlue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_purple, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_pink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_yellow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_black1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_gray1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_red1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_orange1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_green1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_blue1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_darkBlue1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_purple1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_pink1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_yellow1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(undiesColor_random, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lowerColor_random1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(start, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(wearEditorButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loadGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    private void startActionPerformed(ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        Gender gnd = Gender.MALE;
        int bas;
        Random rnd = new Random();
        boolean diff = false;
        String underwearToAssign = "Random";
        String outerwearToAssign = "Random";

        if (femaleRadio.isSelected())
            gnd = Gender.FEMALE;

        if (basSliderRadio.isSelected())
            bas = basSlider.getValue();
        else
            bas = rnd.nextInt(51);

        if (hardDiffRadio.isSelected()) {
            diff = true;
        }

        float incont = incontSlider.getValue() / 10;
        if (incont < 1)
            incont += 0.5;

        try {
            System.out.println(underwearTree.getLastSelectedPathComponent().toString());
        } catch (NullPointerException e) {
            System.out.println("null");
        }

        try {
            System.out.println(outerwearTree.getLastSelectedPathComponent().toString());
        } catch (NullPointerException e) {
            System.out.println("null");
        }

        try {
            System.out.println(lowerColor);
        } catch (NullPointerException e) {
            System.out.println("null");
        }

        try {
            System.out.println(undiesColor);
        } catch (NullPointerException e) {
            System.out.println("null");
        }

        if (underwearTree.getLastSelectedPathComponent() != null)
            underwearToAssign = underwearTree.getLastSelectedPathComponent().toString();
        if (outerwearTree.getLastSelectedPathComponent() != null)
            outerwearToAssign = outerwearTree.getLastSelectedPathComponent().toString();


//        try {
//            switch (underwearTree.getLastSelectedPathComponent().toString()) {
//                case "Female":
//                case "Male":
//                case "Special":
//                case "Panties":
//                case "Swimwear":
//                case "Diapers":
//                case "Menstrual pads":
//
//                    break;
//                default:
//                    switch (outerwearTree.getLastSelectedPathComponent().toString()) {
//                        case "Male":
//                        case "Female":
//                        case "Jeans":
//                        case "Trousers":
//                        case "Skirts":
//                            break;
//                        default:
        new ALongHourAndAHalf(nameField.getText(),
                gnd,
                diff,
                incont, (short) bas,
                underwearToAssign,
                outerwearToAssign,
                undiesColor,
                lowerColor);
        this.dispose();
//                    }
//            }
//        } catch (NullPointerException e) {
//            System.err.println("Duh");
//        }
    }//GEN-LAST:event_startActionPerformed

    private void basSliderRadioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_basSliderRadioActionPerformed

    }//GEN-LAST:event_basSliderRadioActionPerformed

    private void normalDiffRadioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_normalDiffRadioActionPerformed

    }//GEN-LAST:event_normalDiffRadioActionPerformed

    private void randomBasSliderActionPerformed(ActionEvent evt) {//GEN-FIRST:event_randomBasSliderActionPerformed

    }//GEN-LAST:event_randomBasSliderActionPerformed

    private void maleRadioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        if (nameField.getText().equals("Mrs. Nobody"))
            nameField.setText("Mr. Nobody");
    }//GEN-LAST:event_maleRadioActionPerformed

    private void femaleRadioActionPerformed(ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        if (nameField.getText().equals("Mr. Nobody"))
            nameField.setText("Mrs. Nobody");
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void undiesColor_blackMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_blackMouseClicked
    {//GEN-HEADEREND:event_undiesColor_blackMouseClicked
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 3));

        //Unchecking other colors
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Black";
    }//GEN-LAST:event_undiesColor_blackMouseClicked

    private void undiesColor_grayMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_grayMouseClicked
    {//GEN-HEADEREND:event_undiesColor_grayMouseClicked
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Gray";
    }//GEN-LAST:event_undiesColor_grayMouseClicked

    private void undiesColor_redMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_redMouseClicked
    {//GEN-HEADEREND:event_undiesColor_redMouseClicked
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Red";
    }//GEN-LAST:event_undiesColor_redMouseClicked

    private void undiesColor_orangeMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_orangeMouseClicked
    {//GEN-HEADEREND:event_undiesColor_orangeMouseClicked
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Orange";
    }//GEN-LAST:event_undiesColor_orangeMouseClicked

    private void undiesColor_yellowMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_yellowMouseClicked
    {//GEN-HEADEREND:event_undiesColor_yellowMouseClicked
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Yellow";
    }//GEN-LAST:event_undiesColor_yellowMouseClicked

    private void undiesColor_greenMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_greenMouseClicked
    {//GEN-HEADEREND:event_undiesColor_greenMouseClicked
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Green";
    }//GEN-LAST:event_undiesColor_greenMouseClicked

    private void undiesColor_blueMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_blueMouseClicked
    {//GEN-HEADEREND:event_undiesColor_blueMouseClicked
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Blue";
    }//GEN-LAST:event_undiesColor_blueMouseClicked

    private void undiesColor_darkBlueMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_darkBlueMouseClicked
    {//GEN-HEADEREND:event_undiesColor_darkBlueMouseClicked
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Dark blue";
    }//GEN-LAST:event_undiesColor_darkBlueMouseClicked

    private void undiesColor_purpleMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_purpleMouseClicked
    {//GEN-HEADEREND:event_undiesColor_purpleMouseClicked
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Purple";
    }//GEN-LAST:event_undiesColor_purpleMouseClicked

    private void undiesColor_pinkMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_pinkMouseClicked
    {//GEN-HEADEREND:event_undiesColor_pinkMouseClicked
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Pink";
    }//GEN-LAST:event_undiesColor_pinkMouseClicked

    private void lowerColor_pink1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_pink1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_pink1MouseClicked
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Pink";
    }//GEN-LAST:event_lowerColor_pink1MouseClicked

    private void lowerColor_black1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_black1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_black1MouseClicked
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 3));

        //Unchecking other colors
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Black";
    }//GEN-LAST:event_lowerColor_black1MouseClicked

    private void lowerColor_gray1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_gray1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_gray1MouseClicked
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Gray";
    }//GEN-LAST:event_lowerColor_gray1MouseClicked

    private void lowerColor_red1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_red1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_red1MouseClicked
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Red";
    }//GEN-LAST:event_lowerColor_red1MouseClicked

    private void lowerColor_orange1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_orange1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_orange1MouseClicked
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Orange";
    }//GEN-LAST:event_lowerColor_orange1MouseClicked

    private void lowerColor_yellow1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_yellow1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_yellow1MouseClicked
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Yellow";
    }//GEN-LAST:event_lowerColor_yellow1MouseClicked

    private void lowerColor_green1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_green1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_green1MouseClicked
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Green";
    }//GEN-LAST:event_lowerColor_green1MouseClicked

    private void lowerColor_blue1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_blue1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_blue1MouseClicked
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Blue";
    }//GEN-LAST:event_lowerColor_blue1MouseClicked

    private void lowerColor_darkBlue1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_darkBlue1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_darkBlue1MouseClicked
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Dark blue";
    }//GEN-LAST:event_lowerColor_darkBlue1MouseClicked

    private void lowerColor_purple1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_purple1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_purple1MouseClicked
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Purple";
    }//GEN-LAST:event_lowerColor_purple1MouseClicked

    private void undiesColor_randomMouseClicked(MouseEvent evt)//GEN-FIRST:event_undiesColor_randomMouseClicked
    {//GEN-HEADEREND:event_undiesColor_randomMouseClicked
        undiesColor_random.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        undiesColor_black.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        undiesColor_red.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_orange.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_yellow.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_green.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_blue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_darkBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_gray.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_pink.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        undiesColor_purple.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        undiesColor = "Random";
    }//GEN-LAST:event_undiesColor_randomMouseClicked

    private void lowerColor_random1MouseClicked(MouseEvent evt)//GEN-FIRST:event_lowerColor_random1MouseClicked
    {//GEN-HEADEREND:event_lowerColor_random1MouseClicked
        lowerColor_random1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));

        //Unchecking other colors
        lowerColor_black1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 1));
        lowerColor_red1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_orange1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_yellow1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_green1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_blue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_darkBlue1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_gray1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_pink1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
        lowerColor_purple1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));

        lowerColor = "Random";
    }//GEN-LAST:event_lowerColor_random1MouseClicked

    private void wearEditorButtonActionPerformed(ActionEvent evt)//GEN-FIRST:event_wearEditorButtonActionPerformed
    {//GEN-HEADEREND:event_wearEditorButtonActionPerformed
        WearEditor.main(new String[0]);
    }//GEN-LAST:event_wearEditorButtonActionPerformed

    private void wearEditorActionPerformed(ActionEvent evt)//GEN-FIRST:event_wearEditorActionPerformed
    {//GEN-HEADEREND:event_wearEditorActionPerformed

    }//GEN-LAST:event_wearEditorActionPerformed

    private void loadGameButtonActionPerformed(ActionEvent evt)//GEN-FIRST:event_loadGameButtonActionPerformed
    {//GEN-HEADEREND:event_loadGameButtonActionPerformed

    }//GEN-LAST:event_loadGameButtonActionPerformed

    private void loadGameActionPerformed(ActionEvent evt)//GEN-FIRST:event_loadGameActionPerformed
    {//GEN-HEADEREND:event_loadGameActionPerformed
        if (fcGame.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fcGame.getSelectedFile();
            try {
                FileInputStream fin = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fin);
                Save save = (Save) ois.readObject();
                new ALongHourAndAHalf(save);
                dispose();
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "File error.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loadGameActionPerformed
    // End of variables declaration//GEN-END:variables
}
