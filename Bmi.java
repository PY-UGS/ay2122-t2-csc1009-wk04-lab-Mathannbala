import java.util.Scanner;

public class Bmi {

    private double heightInInches;
    private double weightInPounds;
    private double bmi;
    private String bmiResult;

    public Bmi(double heightInInches, double height){
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public  Bmi(double heightInInches, double weightInPounds, double bmi, String bmiResult){

        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
        this.bmi = bmi;
        this.bmiResult = bmiResult;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches){
        this.heightInInches = heightInInches;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds){
        this.weightInPounds = weightInPounds;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double weightInPounds, double heightInInches) {
        this.bmi = weightInPounds / (Math.pow(heightInInches,2));
    }

    public String getBmiResult() {
        return bmiResult;
    }

    public void setBmiResult(double bmi) {
        //use if-else
        if (bmi<18.5){
            this.bmiResult = "Underweight";
        }
        else if (bmi <25.0 ){
            this.bmiResult = "Normal";
        }
        else if (bmi <30.0){
            this.bmiResult = "Overweight";
        }
        else {
            this.bmiResult = "Obese";
        }
    }
}

class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble() *  0.45359237;;
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble() * 0.0254;;
        input.close();


        Bmi userBmi = new Bmi(weight,height);
        userBmi.setBmi(weight, height);
        userBmi.setBmiResult(userBmi.getBmi());

        System.out.println("BMI is " +userBmi.getBmi());
        System.out.println(userBmi.getBmiResult());





    }
}
