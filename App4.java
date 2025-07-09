/*
	Name: Aikaterinh Palaiologou
	
*/

abstract class Animal {
	
	String name;
	private static int animals = 0;
	
	Animal(String n) {
		name = n;
		animals++;
	}
	
	abstract void speak();
	static int numberOfAnimals() {
		return animals;
	}

}

class Dog extends Animal {
	String sound = "woof";
	private static int dogs = 0;
    private String name;
	// Fill your code here
	Dog(String name){
		super(name);
		dogs++;
		super.name=name;
	}
	public void speak(){
		System.out.println( super.name+" : "+sound);
	}
	public static int numberOfDogs(){
		return dogs;
	}

}

class Cat extends Animal {
	String sound = "miaou";
	private static int cats = 0;
    private String name;
	// Fill your code here
	Cat(String name){
		super(name);
		cats++;
		super.name=name;
	}
	public void speak(){
		System.out.println( super.name+" : "+sound);
	}
	public static int numberOfCats(){
		return cats;
	}

}

class App4 {

	public static void main(String[] args) {
		Animal[] animal = {	new Cat("stella"), new Cat("ziggy"), new Dog("azor")};
		System.out.println("Cats: "+Cat.numberOfCats());
		System.out.println("Dogs: "+Dog.numberOfDogs());
		System.out.println("Animals: "+Animal.numberOfAnimals());
		for ( int i = 0; i < animal.length; i++ )
			animal[i].speak();
	}
}
