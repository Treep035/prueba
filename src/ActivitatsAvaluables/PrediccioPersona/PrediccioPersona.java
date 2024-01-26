package ActivitatsAvaluables.PrediccioPersona;
import java.util.Scanner;

public class PrediccioPersona {
	public static void main (String args[]) {
		PrediccioPersona programa = new PrediccioPersona();
		programa.inici();
	}

		public void inici() {
			mes();
			nom();
			edat();
			tractarOpcio();
		}

		public String mes() {
			Scanner s = new Scanner(System.in);
			System.out.print("Escriu el mes en què vas nèixer.");
			System.out.print("\n");
			System.out.print("Gener\tFebrer\tMarc\n");
			System.out.print("Abril\tMaig\tJuny\n");
			System.out.print("Juliol\tAgost\tSetembre\n");
			System.out.print("Octubre\tNovembre\tDesembre");
			System.out.print("\n\n");
			String mesNaixement = s.nextLine();
			return mesNaixement;
		}

		public String nom() {
			Scanner s = new Scanner(System.in);
			System.out.print("\n");
			System.out.print("Com et dius?\n");
			String nom = s.nextLine();
			return nom;
		}

		public int edat() {
			Scanner s = new Scanner(System.in);
			System.out.print("\n");
			System.out.print("Per acabar, quants anys tens?\n");
			int edat = s.nextInt();
			System.out.print("\n\n");
			return edat;
		}

		public void tractarOpcio(int edat, int nom, String mesNaixement) {
			String equipFutbol = "";
			String llenguatgeProgramacio = "";
			int numSort = 0;
			if (mesNaixement.equals("Gener") || mesNaixement.equals("gener")) {
				numSort = edat * 3/2;
				equipFutbol = "Bayern de Munich";
				llenguatgeProgramacio = "C++";
		 	}
			else if (mesNaixement.equals("Febrer")|| mesNaixement.equals("febrer")){
				numSort = edat - 4;
				equipFutbol = "Atlético de Madrid";
				llenguatgeProgramacio = "Python";
			}
			else if (mesNaixement.equals("Marc")|| mesNaixement.equals("marc")){
				numSort = edat / 2;
				equipFutbol = "Chelsea";
				llenguatgeProgramacio = "JavaScript";
			}
			else if (mesNaixement.equals("Abril")|| mesNaixement.equals("abril")){
				numSort = edat % 4;
				equipFutbol = "Manchester city";
				llenguatgeProgramacio = "Node.js";
			}
			else if (mesNaixement.equals("Maig")|| mesNaixement.equals("maig")){
				numSort = edat * 3/6;
				equipFutbol = "Liverpool";
				llenguatgeProgramacio = "React";
			}
			else if (mesNaixement.equals("Juny")|| mesNaixement.equals("juny")){
				numSort = edat + edat;
				equipFutbol = "Real Madrid";
				llenguatgeProgramacio = "C#";
			}
			else if (mesNaixement.equals("Juliol")|| mesNaixement.equals("juliol")){
				numSort = edat * edat / 5;
				equipFutbol = "BVB";
				llenguatgeProgramacio = "Swift";
			}
			else if (mesNaixement.equals("Agost")|| mesNaixement.equals("agost")){
				numSort = edat * 1/2 * edat;
				equipFutbol = "FCB";
				llenguatgeProgramacio = "Java";
			}
			else if (mesNaixement.equals("Setembre")|| mesNaixement.equals("setembre")){
				numSort = edat / edat;
				equipFutbol = "Juve";
				llenguatgeProgramacio = "PHP";
			}
			else if (mesNaixement.equals("Octubre")|| mesNaixement.equals("octubre")){
				numSort = edat * 4 / 3;
				equipFutbol = "PSG";
				llenguatgeProgramacio = "R";
			}
			else if (mesNaixement.equals("Novembre")|| mesNaixement.equals("novembre")){
				numSort = edat % 2 + 23;
				equipFutbol = "Sevilla CF";
				llenguatgeProgramacio = "Go";
			}
			else if (mesNaixement.equals("Desembre")|| mesNaixement.equals("desembre")){
				numSort = (edat + edat) / 2;
				equipFutbol = "Manchester United";
				llenguatgeProgramacio = "Ruby";
			}
			else {
				numSort = 0;
				equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
				llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
				System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
			}
		}
		public Scanner getS() {
			return s;
		}
		public void setS(Scanner s) {
			this.s = s;
		}
		public String getMesNaixement() {
			return mesNaixement;
		}
		public void setMesNaixement(String mesNaixement) {
			this.mesNaixement = mesNaixement;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getEdat() {
			return edat;
		}
		public void setEdat(int edat) {
			this.edat = edat;
		}
		public String getEquipFutbol() {
			return equipFutbol;
		}
		public void setEquipFutbol(String equipFutbol) {
			this.equipFutbol = equipFutbol;
		}
		public String getLlenguatgeProgramacio() {
			return llenguatgeProgramacio;
		}
		public void setLlenguatgeProgramacio(String llenguatgeProgramacio) {
			this.llenguatgeProgramacio = llenguatgeProgramacio;
		}
		public int getNumSort() {
			return numSort;
		}
		public void setNumSort(int numSort) {
			this.numSort = numSort;
		}

		public void final() {
		System.out.print("------------------------------------------------\n");

		System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
		System.out.print("\n\n");

		System.out.print(">>> El teu número de la sort és el " + numSort + "!");
		System.out.print("\n\n");

		System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
		System.out.print("\n\n");

		System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
		System.out.print("\n\n");

		System.out.print("Torna quan vulguis!\n");
		System.out.print("------------------------------------------------\n\n\n");

	}
}
