package ActivitatsAvaluables.CalculArees;
import java.util.Scanner;

public class CalculArees {
	
	private boolean fi = false;

	public static void main (String args[]) {
		CalculArees programa = new CalculArees();
		programa.inici();
	}

		public void inici() {
			while(!fi) {
				menu();
				tractarOpcio();
				resultat();
			}
		}

		public void menu() {
			System.out.println("De quina figura vols calcular l'area?");
			System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
			System.out.println("Per acabar el programa: FI");
		}

		public void tractarOpcio() {
			Scanner lector = new Scanner(System.in);
			String figura = lector.nextLine();
			double area = 0;
			if (figura.equals("triangle")){
				area = triangle();
			}
			else if (figura.equals("quadrat")){
				quadrat();
			}
			else if (figura.equals("rectangle")){
				rectangle();
			}
			else if (figura.equals("trapezi")){
				trapezi();
			}
			else if (figura.equals("rombe")){
				rombe();
			}
			else if (figura.equals("paralelogram")){
				paralelogram();
			}
			else if (figura.equals("cercle")){
				cercle();
		 	}
			else if (figura.equalsIgnoreCase("FI")) {
				fi= true;
			}
			else {
				System.out.println("Opció incorrecta!\n");
			}
		}

		public double triangle() {
			double b = 23.0;
			double h = 8.0;
			area = (b*h)/2;
			return area;
		}

		public double quadrat() {
			double r = 37.0;
			area = Math.pow(r, 2);
			return area;
		}

		public double rectangle() {
			double a = 68.0;
			double b = 39.0;
			area = a*b;
			return area;
		}

		public double trapezi() {
			double a = 35.0;
			double b = 16.0;
			double h = 5.0;
			area = ((a*b)*h)/2;
			return area;
		}

		public double rombe() {
			double dM = 75.0;
			double dm = 30.0;
			area = (dM*dm)/2;
			return area;
		}

		public double paralelogram() {
			double b = 45.0;
			double h = 13.0;
			area = b*h;
			return area;
		}

		public double cercle() {
			Scanner s = new Scanner(System.in);
			System.out.println("Quin es el radi del cercle?");
			double r = s.nextDouble();
			area = Math.pow(r, 2)*Math.PI;
			return area;
		}

		public void resultado() {
			System.out.println("L'area de tu figura " + " es " +area);
		}
}