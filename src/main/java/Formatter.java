public class Formatter {
    String rub ="";
    public void formatRub(double price) {
        int form = (int) Math.floor(price);
        if (form % 100 >= 11 && form % 100 <= 14) {
            rub = "рублей";
        } else if (form % 10 == 1 && form >11 || form==1) {
            rub = "рубль";
        } else if (form % 10 >= 2 && form % 10 <= 4 || form >= 2 && form <= 4) {
            rub = "рубля";
        } else if (form % 10 >= 5 && form % 10 <= 9 || form >= 5 && form <= 9) {
            rub = "рублей";
        } else if (form % 10 == 0) {
            rub = "рублей";
        }

    }
}
