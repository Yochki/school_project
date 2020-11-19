package third;

public class TV_test {

	public static void main(String[] args) {
		TV tv1 = new TV();
		System.out.println(" channel " + tv1.channel + " volume " + tv1.volume + " on: " + tv1.on);
		tv1.switchOn();
		tv1.channelUp();
		tv1.volumeUp();
		System.out.println(" channel " + tv1.channel + " volume " + tv1.volume + " on: " + tv1.on);

	}

}
