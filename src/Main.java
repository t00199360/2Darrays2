public class Main {

    public static void main(String[] args) {

        TimeTable timeTable = new TimeTable();
        timeTable.set(0,0,new ClassDetails("hi","R302"));
        timeTable.set(0,1,new ClassDetails("LAN","T909"));
        timeTable.set(0,2,new ClassDetails("Harry","Y687"));
        timeTable.set(1,0,new ClassDetails("Dave","G708"));
        timeTable.set(1,1,new ClassDetails("Steve","P123"));
        timeTable.set(1,2,new ClassDetails("Jeff","W956"));
        timeTable.set(2,0,new ClassDetails("Jimbo","G564"));
        timeTable.set(2,1,new ClassDetails("Jeff","S195"));
        timeTable.set(2,2,new ClassDetails("3D","D185"));
        timeTable.set(2,3,new ClassDetails("Games","U798"));

        timeTable.display();

        System.out.println(timeTable.get(2,2));
        System.out.println("This is the number of classes for the searched class " + timeTable.getNumberOfClassesFor("Dave"));
        System.out.println("This is the number of free classes " + timeTable.getNumberOfFreeSlots());



        Medals medals = new Medals();
        medals.set(0,0, 1);
        medals.set(0, 2, 1);
        medals.set(1, 0, 1);

        //etc
        medals.display();

        int totalMedals = medals.total();

        System.out.println("\n\nTotal medals " + totalMedals);

        int[] countryTotals = medals.calculateRowTotals();

        //Display the row totals
        System.out.println("Row Totals: ");
        for (int i = 0; i < countryTotals.length; i++)
        {
            System.out.println(countryTotals[i]);
        }

        int[] medalTotals = medals.calculateColumnTotals();

        System.out.println("Medal Type Totals: ");
        for (int i = 0; i < medalTotals.length; i++)
        {
            System.out.println(medalTotals[i]);
        }
    }
}

