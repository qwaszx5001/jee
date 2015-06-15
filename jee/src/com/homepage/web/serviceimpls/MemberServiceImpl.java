package com.homepage.web.serviceimpls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.exceptions.LoginException;
import com.homepage.web.services.MemberService;

public class MemberServiceImpl implements MemberService{
	
	MemberBean bean = new MemberBean();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	public void join(String id, String password, String name, int age, String addr) {
		bean.setAddr(addr);
		bean.setAge(age);
		bean.setId(id);
		bean.setName(name);
		bean.setPassword(password);
		
		map.put("id", bean.getId());
		map.put("password", bean.getPassword());
		map.put("name", bean.getName());
		
		map.put("age", String.valueOf(bean.getAge()));
		map.put("addr", bean.getAddr());

		Set<Entry<String, Object>> set = map.entrySet();
		Iterator<Entry<String, Object>> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
	}

	@Override
	public MemberBean login(String id, String password) {
		/*
		 * 3.세번째 에러 유형
		 * map.get(id) => 파라미터 유형은 반드시 String 으로 해야 함.
		 * */
		
		
		if(map.get("id").equals(id) && map.get("password").equals(password)){
			MemberBean bean = new MemberBean();
			bean.setId(id);
			bean.setPassword(password);
			bean.setAddr((String)map.get("addr"));
			bean.setAge(Integer.parseInt((String)map.get("age")));
			bean.setName((String)map.get("name"));
			
			return bean;
			
					
//					"환영합니다. " +bean.getAddr()+"에 사는 "+bean.getAge()+"세 "+bean.getName()+"님 ..";
		}else if(!(map.get("id").equals(id)) && map.get("password").equals(password)){
			throw new LoginException("입력하신 ID 는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.");
		}
		
		throw new LoginException("비번이 다릅니다. 다시 입력하세요.");
	}

	
}
