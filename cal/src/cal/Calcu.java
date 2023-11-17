import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcu extends Frame implements ActionListener {

    private Label firstNumberLabel, secondNumberLabel, resultLabel;
    private TextField num1Field, num2Field, resultField;
    private Button addButton, subtractButton, multiplyButton, divideButton, andButton, orButton;

    public Calcu() {

        setLayout(new FlowLayout());


        firstNumberLabel = new Label("First Number:");
        secondNumberLabel = new Label("Second Number:");
        resultLabel = new Label("Result:");


        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(10);
        resultField.setEditable(false);

        addButton = new Button("+");
        subtractButton = new Button("-");
        multiplyButton = new Button("*");
        divideButton = new Button("/");
        andButton = new Button("and");
        orButton = new Button("or");

   
        add(firstNumberLabel);
        add(num1Field);
        add(secondNumberLabel);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(andButton);
        add(orButton);

     
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        andButton.addActionListener(this);
        orButton.addActionListener(this);

    
        setTitle("Calculator IT21b Aceey Scratch");
        setSize(250, 200);
        setVisible(true);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
      
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());


            if (e.getSource() == addButton) {
                resultField.setText(String.valueOf(num1 + num2));
            } else if (e.getSource() == subtractButton) {
                resultField.setText(String.valueOf(num1 - num2));
            } else if (e.getSource() == multiplyButton) {
                resultField.setText(String.valueOf(num1 * num2));
            } else if (e.getSource() == divideButton) {
                if (num2 != 0) {
                    resultField.setText(String.valueOf(num1 / num2));
                } else {
                    resultField.setText("Cannot divide by zero");
                }
            } else if (e.getSource() == andButton) {
          
                resultField.setText(String.valueOf((int) num1 & (int) num2));
            } else if (e.getSource() == orButton) {
           
                resultField.setText(String.valueOf((int) num1 | (int) num2));
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Calcu();
    }
}
