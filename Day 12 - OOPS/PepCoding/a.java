// public class a{
//     public static class Person{
//         String name;
//         int age;

//         void saysHi(){
//             System.out.println(name+"["+age+"] says Hi");
//         }

//         // if we forget, java provides our class a default constructor.
//         Person(){
//             //constructor
//         }

//         // Parametrized Constructor
//         Person(String name, int age){
//             this.name = name;
//             this.age = age;
//         }
//     }
//     public static void main(String args[]){
//         Person p1 = new Person();
//         p1.name = "Aakash";
//         p1.age = 22;
//         p1.saysHi();

//         Person p2 = new Person("Aakash", 22);
//         p2.saysHi();
//     }
// }


//------------------>////

// public class a{
//     public static void main(String args[]){
//         Car c1 = new Car(); // new occupies a space in heap for c1 object 
//         c1.setColor("Grey");
//         System.out.println(c1.getColor());
//         c1.setPrize(700000);
//         System.out.println(c1.getPrize());
//         c1.setName("Maruti Suzuki");
//         System.out.println(c1.getName());
//     }
// }

// class Car{
//     private String name;
//     private int prize;
//     private String color;

//     void setColor(String color){
//         this.color = color;
//     }
//     String getColor(){
//         return this.color;
//     }
//     void setPrize(int prize){
//         this.prize = prize;
//     }
//     int getPrize(){
//         return this.prize;
//     }
//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }
// }


// public class a{
//     public static void main(String args[]){
//         Student st = new Student("Radha");
//         System.out.println(st.name);
//     }
// }

// class Student {
//     String name;
//     int roll_no;

//     Student(String name){
//         // System.out.println("Constructor is invoked");
//         this.name = name;
//     }
// }


// public class a{
//     public static void main(String args[]){
//         Animal a = new Animal();
//         a.eat();
//     }
// }

// class Animal{
//     void eat(){
//         System.out.println("eat anything");
//     }
// }
// class Deer{
//     void eat(){
//         System.out.println("eat grass");
//     }
// }



// Interface

// public class a{
//     public static void main(String args[]){
//         Bear b = new Bear();
//         b.veg();
//         b.meat();
//     }
// }

// interface Herbivore{
//     void veg();
// }

// interface Carnivore{
//     void meat();
// }

// class Bear implements Herbivore, Carnivore {
//     public void veg(){
//         System.out.println("Bear eats green vegetables");
//     }

//     public void meat(){
//         System.out.println("Bear eats meat");
//     }
// }

