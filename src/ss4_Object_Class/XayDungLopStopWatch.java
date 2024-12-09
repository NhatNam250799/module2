package BaiTap;

public class XayDungLopStopWatch {
	private long startTime;
	private long endTime;

	public XayDungLopStopWatch() {
		this.startTime = System.currentTimeMillis();
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return endTime - startTime;
	}

	public static void main(String[] args) {
		XayDungLopStopWatch stopwatch = new XayDungLopStopWatch();

		System.out.println("Bắt đầu đo thời gian...");
		stopwatch.start();

		for (int i = 0; i < 100000000; i++) {

			Math.sqrt(i);
		}

		stopwatch.stop();
		System.out.println("Thời gian thực hiện: " + stopwatch.getElapsedTime() + " milliseconds");
	}
}
