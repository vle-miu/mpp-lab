package lecture5.prob1.gui;

import lecture5.prob1.rulesets.RuleException;
import lecture5.prob1.rulesets.RuleSet;
import lecture5.prob1.rulesets.RuleSetFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CDWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JButton button;
    private JTextField artistField;
    private JTextField titleField;
    private JTextField priceField;

    public CDWindow() {
        initializeWindow();
        JPanel mainPanel = new JPanel();
        defineTopPanel();
        defineBottomPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        getContentPane().add(mainPanel);
        pack();
    }

    private static JPanel createTextPanel(JLabel lab, JTextField textField) {

        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        top.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottom.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));


        top.add(lab);
        bottom.add(textField);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        textPanel.add(top, BorderLayout.NORTH);
        textPanel.add(bottom, BorderLayout.CENTER);
        return textPanel;
    }

    public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
    }

    public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
    }

    public static void main(String[] args) {
        CDWindow mf = new CDWindow();
        //mf.pack();
        mf.setVisible(true);
    }

    private void defineTopPanel() {
        topPanel = new JPanel();
        JLabel artistLabel = new JLabel("Artist");
        artistLabel.setFont(makeSmallFont(artistLabel.getFont()));
        artistField = new JTextField(12);
        JPanel isbnPanel = createTextPanel(artistLabel, artistField);


        JLabel titleLabel = new JLabel("Title");
        titleLabel.setFont(makeSmallFont(titleLabel.getFont()));
        titleField = new JTextField(12);
        JPanel titlePanel = createTextPanel(titleLabel, titleField);

        JLabel priceLabel = new JLabel("Price");
        priceLabel.setFont(makeSmallFont(priceLabel.getFont()));
        priceField = new JTextField(12);
        JPanel pricePanel = createTextPanel(priceLabel, priceField);


        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(isbnPanel);
        topPanel.add(titlePanel);
        topPanel.add(pricePanel);

    }

    private void defineBottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        button = new JButton("Update Info");
        button.addActionListener(new ButtonListener());
        bottomPanel.add(button);

    }

    private void initializeWindow() {
        setTitle("Add CD to Collection");
        setSize(520, 180);
        handleWindowClosing();
        centerFrameOnDesktop(this);
        setResizable(false);
    }

    private void handleWindowClosing() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
                System.exit(0);
            }
        });
    }

    private void clearFields() {
        artistField.setText("");
        titleField.setText("");
        priceField.setText("");
    }

    public String getArtistValue() {
        return artistField.getText();
    }

    public String getTitleValue() {
        return titleField.getText();
    }

    public String getPriceValue() {
        return priceField.getText();
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            try {
                RuleSet ruleSet = RuleSetFactory.getRuleSet(CDWindow.this);
                ruleSet.applyRules(CDWindow.this);
                clearFields();
            } catch (RuleException e) {
                JOptionPane.showMessageDialog(CDWindow.this, e.getMessage());
            }
        }
    }

    class BackListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {

        }
    }
}
