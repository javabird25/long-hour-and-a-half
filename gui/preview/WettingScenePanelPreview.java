/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.preview;

/**
 *
 * @author Jonisan
 */
public class WettingScenePanelPreview extends javax.swing.JPanel
{
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form scenePreview
     */
    public WettingScenePanelPreview()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        textLabel = new javax.swing.JLabel();
        textScrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        linesLabel = new javax.swing.JLabel();
        insertVariableButton = new javax.swing.JButton();
        actionsEditButton = new javax.swing.JButton();
        actionsLabel = new javax.swing.JLabel();
        operationsLabel = new javax.swing.JLabel();
        operationsEditButton = new javax.swing.JButton();
        nextSceneLabel = new javax.swing.JLabel();
        nextSceneComboBox = new javax.swing.JComboBox<>();
        watchedChaactersLabel = new javax.swing.JLabel();
        watchedCharactersEditButton = new javax.swing.JButton();

        nameLabel.setText("Scene name");

        textLabel.setText("Scene text");

        textArea.setColumns(20);
        textArea.setRows(5);
        textScrollPane.setViewportView(textArea);

        linesLabel.setText("0/9 lines");

        insertVariableButton.setText("Insert variable...");

        actionsEditButton.setText("Edit...");

        actionsLabel.setText("Scene actions");

        operationsLabel.setText("Scene operations");

        operationsEditButton.setText("Edit...");

        nextSceneLabel.setText("Next scene");

        nextSceneComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<this is the last scene>" }));

        watchedChaactersLabel.setText("Watched characters");

        watchedCharactersEditButton.setText("Edit...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertVariableButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(linesLabel))
                    .addComponent(textScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operationsLabel)
                            .addComponent(actionsLabel)
                            .addComponent(nextSceneLabel))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operationsEditButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actionsEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextSceneComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(watchedChaactersLabel)
                        .addGap(52, 52, 52)
                        .addComponent(watchedCharactersEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLabel)
                    .addComponent(linesLabel)
                    .addComponent(insertVariableButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(watchedChaactersLabel)
                    .addComponent(watchedCharactersEditButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actionsLabel)
                    .addComponent(actionsEditButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operationsLabel)
                    .addComponent(operationsEditButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextSceneLabel)
                    .addComponent(nextSceneComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionsEditButton;
    private javax.swing.JLabel actionsLabel;
    private javax.swing.JButton insertVariableButton;
    private javax.swing.JLabel linesLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> nextSceneComboBox;
    private javax.swing.JLabel nextSceneLabel;
    private javax.swing.JButton operationsEditButton;
    private javax.swing.JLabel operationsLabel;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel textLabel;
    private javax.swing.JScrollPane textScrollPane;
    private javax.swing.JLabel watchedChaactersLabel;
    private javax.swing.JButton watchedCharactersEditButton;
    // End of variables declaration//GEN-END:variables
}
