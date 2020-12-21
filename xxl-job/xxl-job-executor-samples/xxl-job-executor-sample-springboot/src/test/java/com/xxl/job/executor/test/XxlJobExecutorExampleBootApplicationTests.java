package com.xxl.job.executor.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XxlJobExecutorExampleBootApplicationTests {

	@Test
	public void test() {
		String a = "ABBCADDDAC";
		String rs = dupRemoval(a.toCharArray());
		System.out.println(rs);
	}

	String dupRemoval(char[] arr){
		List rslist = new ArrayList<String>();
		List removelist = new ArrayList<String>();
		for (int i = 0; i < arr.length-1 ; i++) {
			if(!(arr[i] ==(arr[i+1]))){
				rslist.add(arr[i]);
			}
		}

		return rslist.toString();
	}
}