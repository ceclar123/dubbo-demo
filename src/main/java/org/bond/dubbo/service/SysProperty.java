package org.bond.dubbo.service;

public class SysProperty {
	/**
	 * 如果spring.profiles.active为null，设置为生产环境
	 */
	public static void isNullsetSysProduction() {
		if (null == System.getProperty("spring.profiles.active"))
			setSysProduction();
	}

	public static void isNullsetSysTest() {
		if (null == System.getProperty("spring.profiles.active"))
			setSysTest();
	}

	public static void isNullsetSysDevelop() {
		if (null == System.getProperty("spring.profiles.active"))
			setSysDevelop();
	}

	/**
	 * 设置spring.profiles.active为develop开发环境
	 */
	public static void setSysDevelop() {
		System.setProperty("spring.profiles.active", "develop");
	}

	/**
	 * 设置spring.profiles.active为test测试环境
	 */
	public static void setSysTest() {
		System.setProperty("spring.profiles.active", "test");
	}

	/**
	 * 设置spring.profiles.active为production生产环境
	 */
	public static void setSysProduction() {
		System.setProperty("spring.profiles.active", "production");
	}

	/**
	 * 判断spring.profiles.active为develop开发环境
	 */
	public static boolean isSysDevelop() {
		String str = System.getProperty("spring.profiles.active");
		return null != str && str.equals("develop");
	}

	/**
	 * 判断spring.profiles.active为test测试环境
	 */
	public static boolean isSysTest() {
		String str = System.getProperty("spring.profiles.active");
		return null != str && str.equals("test");
	}

	/**
	 * 判断spring.profiles.active为production生产环境
	 */
	public static boolean isSysProduction() {
		String str = System.getProperty("spring.profiles.active");
		return null != str && str.equals("production");
	}
}
