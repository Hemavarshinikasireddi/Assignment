/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

/**
 *
 * @author Hema varshini
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
  
        
        class SortByFirstName implements Comparator<Shirt>
{
    @Override
    public int compare(final Shirt shirt, final Shirt shirt2) {
        return shirt.getFirstName().compareTo(shirt2.getFirstName());
    }
}
class SortByLastName implements Comparator<Shirt>
{
    @Override
    public int compare(final Shirt shirt, final Shirt shirt2) {
        return shirt.getLastName().compareTo(shirt2.getLastName());
    }
}
class SortByCity implements Comparator<Shirt>
{
    @Override
    public int compare(final Shirt shirt, final Shirt shirt2) {
        return shirt.getCity().compareTo(shirt2.getCity());
    }
}
class SortByAge implements Comparator<Shirt>
{
    @Override
    public int compare(final Shirt shirt, final Shirt shirt2) {
        return shirt.getAge().compareTo(shirt2.getAge());
    }
}

ArrayList list=new ArrayList();
   Scanner scanner = new Scanner(System.in);
        int flag=0;
        String firstname,lastname;
        while(true){
            System.out.println("Please enter your name: ");
            String name;
            name=scanner.nextLine();
            //String name=scanner.next();
            System.out.println("Please enter your age: ");
            int age=scanner.nextInt();
            System.out.println("Please enter your city: ");
            String city=scanner.next();
            String[] str=name.split(" ");
            firstname=str[0];
            lastname=str[1];
            list.add(new Shirt(firstname,lastname,city,age));
            System.out.println("Do you want to add  yes/no?");
            String answer = scanner.next();
            if (answer.equals("no"))
           
                break;
            scanner.nextLine();
           
        }
        System.out.println("SORT BY");
       
       
        //list.add(new Shirt("blue","boys",42));
        //list.add(new Shirt("black","boys",40));
        //list.add(new Shirt("pink","girls",34));
        Collections.sort(list,new SortByCity());
        System.out.println("\nSorted by city");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
        Collections.sort(list,new SortByAge());
        System.out.println("\nSorted by Age");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
       
        Collections.sort(list,new SortByFirstName());
        System.out.println("\nSorted by FirstName");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
        Collections.sort(list,new SortByLastName());
        System.out.println("\nSorted by LastName");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
           
    }
   
    }
class Shirt
{
    String firstname;
    String lastname;
    String city;
    int age;
    //int idx;
    //String firstName;
    //String lastName;
    Shirt(final String firstname,final String lastname,final String city, final int age) {
        this.firstname =firstname;
        this.lastname =lastname;
        this.city = city;
        this.age = age;
    }
    String getFirstName() {
        return this.firstname;
    }
    String getLastName() {
        return this.lastname;
    }
   
    String getCity() {
        return this.city;
    }
   
    Integer getAge() {
        return this.age;
    }
   
    @Override
    public String toString() {
        return "details of " + this.getFirstName() + "," +this.getLastName()+","+this.getCity() + "," +this.getAge();
    }
}
class SortByFirstName implements Comparator<Shirt>
{
    @Override
    public int compare(final Shirt shirt, final Shirt shirt2) {
        return shirt.getFirstName().compareTo(shirt2.getFirstName());
    }
}
class SortByLastName implements Comparator<Shirt>
{
    @Override
    public int compare(final Shirt shirt, final Shirt shirt2) {
        return shirt.getLastName().compareTo(shirt2.getLastName());
    }
}
class SortByCity implements Comparator<Shirt>
{
    @Override
    public int compare(final Shirt shirt, final Shirt shirt2) {
        return shirt.getCity().compareTo(shirt2.getCity());
    }
}
class SortByAge implements Comparator<Shirt>
{
    @Override
    public int compare(final Shirt shirt, final Shirt shirt2) {
        return shirt.getAge().compareTo(shirt2.getAge());
    }
}






