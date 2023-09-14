
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass
{
    public static void main(String[] args) {
       String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
    for (int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
    }
    for (String value : strArray) {
        System.out.print(value);
    }
    for (int i = 4; i < 5; i++) {
        System.out.println("  ");
    }
    for (int i = 0; i < 5; i++) {
        if (i == 4) {
            System.out.print(strArray[i]);
            break;
        }
        else
        System.out.print(strArray[i] + "-");
        }
    }
}
