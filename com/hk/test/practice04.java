package com.hk.test;

public class practice04 {
	public void amicable(int s, int e) {
		for (int i = s; i < e; i++) {
			if(i!=sumDivisor(s,e)&&i==sumDivisor(sumDivisor(s,e))) {
				System.out.printf("%d와%d는 친화수 관계입니다.\n",i,sumDivisor(s,e));
			}
		}
	}

	public static void main(String[] args) {
		sumDivisor(220,284);
		
	}
	public static int sumDivisor(int num1, int num2) {
		int sum1=0;
		int sum2=0;
		for(int i=1; i<=num1; i++) {
			if(num1%i==0) {
				sum1+=i;
			}
		}
		int a = sum1-num1;
//		System.out.printf("진약수는: %d\n",a);
		
		
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				sum2+=i;	
			}
		}
		int b = sum2-a;
//		System.out.printf("진약수: %d",b);
		if(a==num2 && b==num1) {
			System.out.printf("%d와 %d는 친화수이다.",num1,num2);
		}
		else {
			System.out.printf("%d와 %d는 친화수가 아니다.",num1,num2);
		}
		return 0;
	}
	
}

//package com.hk.test;
//
//public class Practice04 {
//
//    public static void main(String[] args) {
//        // 두 수가 친화수인지 테스트
//        int a = 220, b = 284;
//        if (isAmicable(a, b)) {
//            System.out.printf("%d와 %d는 친화수입니다.\n", a, b);
//        } else {
//            System.out.printf("%d와 %d는 친화수가 아닙니다.\n", a, b);
//        }
//
//        // 범위 내 친화수 찾기
//        Practice04 obj = new Practice04();
//        obj.findAmicablePairs(1, 10000);
//    }
//
//    // 진약수의 합
//    public static int sumOfProperDivisors(int n) {
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        return sum;
//    }
//
//    // 두 수가 친화수인지 판단
//    public static boolean isAmicable(int a, int b) {
//        return sumOfProperDivisors(a) == b && sumOfProperDivisors(b) == a;
//    }
//
//    // 범위 내 친화수 쌍 출력
//    public void findAmicablePairs(int start, int end) {
//        for (int i = start; i < end; i++) {
//            int sum = sumOfProperDivisors(i);
//            if (i < sum && sum < end && isAmicable(i, sum)) {
//                System.out.printf("%d와 %d는 친화수 관계입니다.\n", i, sum);
//            }
//        }
//    }
//}
