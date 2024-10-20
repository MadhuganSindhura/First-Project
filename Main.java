//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int elements[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("original matrix");
        for(int i=0;i<elements.length;i++)
        {
            for(int j=0;j<3;j++)
            {

                System.out.print(elements[i][j]);
            }
            System.out.println();
        }
        System.out.println("transpose matrix");
        for(int i=0;i<elements.length;i++)
        {
            for(int j=0;j<3;j++)
            {

                elements[i][j]=elements[i][j];
                System.out.print(elements[j][i]);
            }
            System.out.println();
        }

    }
}