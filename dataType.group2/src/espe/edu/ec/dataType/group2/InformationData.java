/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.dataType.group2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Group2
 */
public class InformationData {

    private int age;
    private String name;
    private String subject;
    private String telephone;
    private float average;
    private char gender;

    public InformationData() {
    this.age = 0;
    this.name = "";
    this.subject = "";
    this.telephone= "";
    this.average = 0;
    this.gender = ' ';

}

    public InformationData(int age, String name, String subject, String telephone, float average, char gender) {
        this.age = age;
        this.name = name;
        this.subject = subject;
        this.telephone = telephone;
        this.average = average;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "InformationData{" + "age=" + age + ", name=" + name + ", subject=" + subject + ", telephone=" + telephone + ", average=" + average + ", gender=" + gender + '}';
    }
    
    
    
public void DataOut(){
            
            Scanner input = new Scanner(System.in);
            File file = new File("Group2.csv");
                        
            if (!file.exists()) {          
                try {                              
                    file.createNewFile();
                    FileWriter write = new FileWriter(file, true);
                    PrintWriter line = new PrintWriter(write);

                    System.out.print("Enter your name: ");
                    setName(input.nextLine());
                    System.out.print("Enter your age: ");
                    setAge(input.nextInt());
                    input.nextLine();
                    System.out.print("Enter your telephone: ");
                    setTelephone(input.nextLine());
                    System.out.print("Enter your subject: ");
                    setSubject(input.nextLine());
                    System.out.print("Enter your average: ");
                    setAverage(input.nextFloat()); 
                    System.out.print("Enter your gender Male(M) or Female(F):  ");
                    setGender(input.next().charAt(0));             
                    line.println(getName()+","+getAge()+","+getSubject()+","+getAverage()+","+getTelephone()+","+getGender());
                    line.close();
                    write.close();
              

                

}catch (IOException ex) {
                    Logger.getLogger(PeopleData.class
.getName()).log(Level.SEVERE, null, ex);
                }
            
            } else {
                try {
                FileWriter write = new FileWriter(file, true);
                PrintWriter line = new PrintWriter(write);

                System.out.print("Enter your name: ");
                setName(input.nextLine());
                System.out.print("Enter your age: ");
                setAge(input.nextInt());
                input.nextLine();
                System.out.print("Enter your telephone: ");
                setTelephone(input.nextLine());
                System.out.print("Enter your subject: ");
                setSubject(input.nextLine());
                System.out.print("Enter your average: ");
                setAverage(input.nextFloat()); 
                System.out.print("Enter your gender Male(M) or Female(F):  ");
                setGender(input.next().charAt(0));
                
                line.println(getName()+","+getAge()+","+getSubject()+","+getAverage()+","+getTelephone()+","+getGender());
                line.close();
                write.close();

                

} catch (IOException ex) {
                    Logger.getLogger(PeopleData.class
.getName()).log(Level.SEVERE, null, ex);
                }           
            }                                       
        }

   /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the average
     */
    public float getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(float average) {
        this.average = average;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
}
