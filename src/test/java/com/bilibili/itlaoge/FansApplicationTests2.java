package com.bilibili.itlaoge;

import com.bilibili.itlaoge.handler2.AbstractHandler;
import com.bilibili.itlaoge.handler2.Factory2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FansApplicationTests2 {

	@Test
	String noDesign2() {
		String name = "张三";

		if (name.equals("张三")) {

			// 业务逻辑B
			return "张三完成任务BBB";

		} else if (name.equals("李四")) {

			// 业务逻辑B
			return "李四完成任务BBB";

		} else if (name.equals("王五")) {

			// 业务逻辑B
			return "王五完成任务BBB";

		} else if (name.equals("赵六")) {

			// 业务逻辑A
			System.out.println("赵六完成任务AAA");

		} else if (name.equals("田七")) {

			// 业务逻辑A
			System.out.println("田七完成任务AAA");

		} else if (name.equals("亢八")) {

			// 业务逻辑A
			System.out.println("亢八完成任务AAA");

		}
		return "end";
	}

	// 工厂 + 策略 + 模板设计模式
	@Test
	void design2() {
		String name = "张三";

		AbstractHandler strategy = Factory2.getInvokeStrategy(name);

//		strategy.AAA(name);

		String str = strategy.BBB(name);

		System.out.println(str);
	}
}