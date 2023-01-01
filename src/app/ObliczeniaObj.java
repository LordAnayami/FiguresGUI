    package app;


    import java.awt.*;
    import javax.swing.*;

    /**
     *
     * @author Lenovo
     */
    public class ObliczeniaObj extends JComponent {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1125258259561446216L;
		private int wybor = 0;
		private String Opcja = "Wybierz figure z listy powy¿ej.";
        private final String string1 = "Wybierz figure z listy powy¿ej.";
        private final String stringsz = "Wybrano szeœcian. Wzór na objêtoœæ szeœcianu to X^3. Podaj wartoœæ X.";
        private final String stringpro = "Wybrano prostopad³oœcian. Wzór na objêtoœæ prostopad³oœcianu to X*Y*H. Podaj wartoœæ X,Y i H.";
        private final String stringwal = "Wybrano walec. Wzór na objêtoœæ walca to pi*r^2*H. Podaj wartoœæ R i H.";
        private final String stringsto = "Wybrano sto¿ek. Wzór na objêtoœæ sto¿ka to pi*r^2*H/3. Podaj wartoœæ R i H.";    
        private final String stringku = "Wybrano kulê. Wzór na objêtoœæ kuli to 4/3*pi*r^3. Podaj wartoœæ R."; 
        private String Wynik = " "; 
        private final Double pi = 3.14;
        private Double wynik = 0.0;
       // private String X;
       // private String Y;
       // private String H; 
       // private String R;      

        public void setWybor(int W)
        {
            wybor = W;

        }

        public String getWzor()
        {
            switch (wybor)
            {
                case 0:
                	Opcja =  string1;
                case 1:
                	 Opcja = stringsz;
                case 2:
                	 Opcja = stringpro;
                case 3:
                	 Opcja = stringwal;
                case 4:
                	 Opcja = stringsto;
                case 5:
                	 Opcja = stringku;

            }
			return Opcja;
        }


        public String objetosc(String X, String Y, String H, String R)
        {
           double x=Double.parseDouble(X);
           double y=Double.parseDouble(Y);
           double h=Double.parseDouble(H);
           double r=Double.parseDouble(R);

            switch (wybor)
            {

            case 0:
                {
                    Wynik = " ";
                }

            case 1:
                {
                    wynik = x*x*x;
                    Wynik = String.valueOf(wynik);
                }
             case 2:
                {
                    wynik = x*y*h;
                    Wynik = String.valueOf(wynik);

                }

             case 3:
                {
                    wynik = pi*r*r*h;
                    Wynik = String.valueOf(wynik);

                }

            case 4:
                {
                    wynik = pi*r*r*h/3;
                    Wynik = String.valueOf(wynik);

                }

            case 5:
                {
                    wynik = pi*r*r*r*4/3;
                    Wynik = String.valueOf(wynik);

                }   
        }

    return Wynik;
    }


    }
