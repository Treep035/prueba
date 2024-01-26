package ActivitatsNoAvaluables.ParàmetresDeSortida;
import ActivitatsNoAvaluables.ParàmetresDeSortida.ParametresDeSortida;
import java.util.Scanner;

public class ParametresDeSortida {
	private Scanner lector = new Scanner(System.in);
	private int[] nums;
	public static void main (String[] args) {
		ParametresDeSortida programa = new ParametresDeSortida();
		programa.inici();
	}
	
	public void inici() {
		int mida = mesura();
		int[] nums = vector(mida);
		int a = segon (nums);
		System.out.println("El segon valor més gran és: " + a);
	}

	public int mesura() {
		System.out.print("De quant és la mesura del vector? ");
		int mida = lector.nextInt();
		return mida;
	}
	
	public int vector(int mida) {
		[] nums = new int[mida];
		System.out.print("Quins són els valors del vector? ");
		for (int i = 0; i < nums.length; i++) {
			int vector = lector.nextInt();
			nums[i] = vector;
		}
		return [] nums;
	}

	public int segon() {

		int primerNumMax = nums[0];
		int segundoNumMax = nums[1];

		if (segundoNumMax > primerNumMax) {
			int canvi = primerNumMax;
			primerNumMax = segundoNumMax;
			segundoNumMax = canvi;
		}

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] > primerNumMax) {
				segundoNumMax = primerNumMax;
				primerNumMax = nums[i];
			} else if (nums[i] > segundoNumMax && nums[i] < primerNumMax) {
				segundoNumMax = nums[i];
			}
		}
		return segundoNumMax;
	}
}
