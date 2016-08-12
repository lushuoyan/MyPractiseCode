package newcoder.leetcode;

import java.util.HashMap;

import component.Point;

/**
 * ������
 * 
 * @author luoshuoyan
 * @date 2016��8��11��
 */
public class MaxPointsOnALine{
	public static int maxPoints(Point[] points) {
		if (points.length <= 2) {
			return points.length;
		}
		// б��
		double k = 0.0;
		int maxPointNum = 0;
		int tempMaxPointNum = 0;
		// ������ȫ��ͬ��ĸ���
		int samePointNum = 0;
		// ��x��ƽ��
		int parallelPointNum = 0;
		HashMap<Double, Integer> slopeMap = new HashMap<Double, Integer>();
		for (int i = 0; i < points.length - 1; i++) {
			// ������ʼ�㣬�ᱻ�ۼ���
			samePointNum = 1;
			parallelPointNum = 0;
			tempMaxPointNum = 0;
			slopeMap.clear();
			for (int j = i + 1; j < points.length; j++) {
				// ������ȫ��ͬ
				if ((points[i].x == points[j].x)
						&& ((points[i].y == points[j].y))) {
					samePointNum++;
					continue;
				}
				// ��y��ƽ��
				if (points[i].x == points[j].x) {
					parallelPointNum++;
				} else {
					if (points[i].y == points[j].y) {
						k = 0;
					} else {
						k = ((double) (points[i].y - points[j].y))
								/ (points[i].x - points[j].x);
					}
					// б�ʲ�����
					if (slopeMap.get(k) == null) {
						slopeMap.put(k, new Integer(1));
						if (1 > tempMaxPointNum) {
							tempMaxPointNum = 1;
						}
					} else {
						// б���Ѵ���
						int number = slopeMap.get(k);
						number++;
						slopeMap.put(k, new Integer(number));
						if (number > tempMaxPointNum) {
							tempMaxPointNum = number;
						}
					}
				}
			} // end of for

			if (parallelPointNum > 1) {
				if (parallelPointNum > tempMaxPointNum) {
					tempMaxPointNum = parallelPointNum;
				}
			}
			// ������ʼ��;�����ͬ����ĵ�
			tempMaxPointNum += samePointNum;
			if (tempMaxPointNum > maxPointNum) {
				maxPointNum = tempMaxPointNum;
			}
		}
		return maxPointNum;
	}

}
