package edu.handong.csee.java;

public class FamilyNamePrinter {
    private String[] stringNames;
    private String[] familyNames;

    
    public FamilyNamePrinter(String names){
        stringNames = names.split(", ");
        familyNames = new String[stringNames.length];
    }
    public void printFamilyNames(){
        // for(String name : stringNames){
        //     System.out.println(name);
        // }
        for(int i=0; i<stringNames.length; i++){
            familyNames[i] = stringNames[i].trim().split(" ")[1];
        }
        for(String familyName:familyNames){
            System.out.println(familyName);
        }
    }

    public static void main(String[] args){
        FamilyNamePrinter FNPrinter = new FamilyNamePrinter(args[0]);
        FNPrinter.printFamilyNames();
    }
}