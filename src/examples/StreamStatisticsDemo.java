package examples;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamStatisticsDemo {

	public static void main(String[] args) {
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
				.summaryStatistics();
		System.out.println(summary);
		System.out.println(summary.getAverage());
		System.out.println(summary.getCount());
	}

}
