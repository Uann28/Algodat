package com.belajar;

// karakter
class Karakter {
    String nama;
    int HP; 

    Makanan makanan;

    Karakter(String nama, int HP){
        this.nama = nama;
        this.HP = HP;
    }

    void eat(Makanan makanan){
        int IncreaseHP = this.makanan.IncreaseHP;
        System.out.println(this.nama + " sedang memakan " + makanan.nama + " dengan nutrisi " + IncreaseHP);
        Status(IncreaseHP);
    }

    void Status(int IncreaseHP){
        this.HP += this.makanan.IncreaseHP;
    }

    void InputMenu(Makanan makanan){
        this.makanan = makanan;
    }


    void display(){
        System.out.println("nama = " + this.nama);
        System.out.println("HP = " + this.HP + " HP");
        System.out.println("MENU");
        makanan.display();  
    }
}
// makanan makanan
class Makanan {
    int IncreaseHP;
    String nama;

    Makanan(String nama, int IncreaseHP){
        this.nama = nama;
        this.IncreaseHP = IncreaseHP;
    }

    void display(){
        System.out.println(this.nama + "\t nutrisi : " + this.IncreaseHP);
    }

}

public class Main {
    
    public static void main(String[] args) {
        
        Karakter karakter1 = new Karakter("Juan",10);
        Karakter karakter2 = new Karakter("Masdi",15);

        Makanan sayurSop = new Makanan("Sayur Sop", 20);
        Makanan ayamBakar = new Makanan("Ayam Bakar", 15);
        Makanan burger = new Makanan("Burger", 50);


        karakter1.InputMenu(sayurSop);
        karakter2.InputMenu(burger);
        karakter1.display();
        karakter2.display();
        
        // memakan
        System.out.println();
        karakter1.eat(sayurSop);
        karakter1.display();
        karakter2.eat(burger);
        karakter2.display();
    }
}
