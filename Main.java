

public class Main { 
    public static void main(String[] args) { 
        
 
        Book book1 = new Book("Война и мир", 1869, "Толстой", 1300); 
        Book book2 = new Book("Маленький принц", 1943, "Антуан де Сент-Экзюпери", 96); 
 
        System.out.println(book1); 
        System.out.println("Книга большая? " + book1.isBig()); 
        System.out.println("Совпадение со словом 'Толстой'? " + book1.matches("Толстой")); 
        System.out.println("Цена книги: " + book1.estimatePrice() + " руб."); 
 
        System.out.println(); 
 
        System.out.println(book2); 
        System.out.println("Книга большая? " + book2.isBig()); 
        System.out.println("Совпадение со словом 'Антуан'? " + book2.matches("Антуан")); 
        System.out.println("Совпадение со словом 'Сент'? " + book2.matches("Сент")); 
        System.out.println("Цена книги: " + book2.estimatePrice() + " руб."); 
    } 
}
