public class Main {

    public static void main(String[] args) {
        Workings workings = new Workings();
        Lang lang = new Lang();
        StrInv strInv = new StrInv();
        String s = "у вови найвища зарплата з персоналу";
        strInv.setSt(s);
        System.out.println("Зарплата Юри: " + workings.working[2].getPrice() + "   Зарплата Галі: " + workings.working[1].getPrice());//Вивожу зарплату Юри та Галі
        System.out.println(lang.ru.col[1] + "   " + lang.en.col[2] + "   " + lang.uk.col[0]);// вивожу красный, green, та блакитний
        System.out.println(lang.getLeng("красный") + "   " + lang.getLeng("green") + "    "  + lang.getLeng("блакитний"));// вивожу мови на який написані такі кольори: красный, green, та блакитний
        System.out.println(strInv.getString() + ", кількість слів: " + strInv.p + ", кількість голосних: " + strInv.kGl(s));
    }
}
