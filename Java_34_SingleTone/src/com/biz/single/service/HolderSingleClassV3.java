package com.biz.single.service;
/*
 * thread 환경에서 안정성을 보장한다.
 * 
 * thread 환경에서 개발자가 동기화 문제를 직접 해결하는 것은
 * 배보다 배꼽이 더 엄청나게 커지는 결과를 낳게 된다.
 * 
 * 다양한 방법으로 thread safe 하기 위해 여러가지 도구를 사용한다.
 * 
 * 운영체제에게 관리를 맡기는 방법도 사용했지만
 * JVM 환경에서는 썩 좋은 패턴이 아니다.
 * 
 * Holder 방식은 JVM의 초기화(시작) 과정에서 원자적특성을 이용하여
 * 싱글톤 클래스의 초기화 관련된 문제를 
 * 
 */
public class HolderSingleClassV3 {

	private HolderSingleClassV3() {
	}
	
	private static class InnerHolder{
		public static final HolderSingleClassV3 INSTANCE
			= new HolderSingleClassV3();
	}
	
	public static HolderSingleClassV3 getInstance() {
		return InnerHolder.INSTANCE;
	}
	
}
