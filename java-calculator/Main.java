public class Main{
    public static void main (String[] args) {
        int a = 2;
        int b = 3;
        int h = 2;
        int c;
    switch(h){
        case 1:
            c = a + b;
            System.out.println(c);
            return;
        case 2: 
            c = a - b;
            System.out.println(c);
            return;
        case 3:
            c = a*b;
            System.out.println(c);
            return;
        case 4:
            if (a!=0) {
            c = b/a;
            System.out.println(c);
        } else {
            System.out.println("Ошибка");
        } 
        return;
        
}
}
}