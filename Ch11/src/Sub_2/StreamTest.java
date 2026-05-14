package Sub_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 날짜: 2026-05-4
 * 이름 : 이찬영
 * 내용 : java 컬렉션 스트림 실습
 */
class Person{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class StreamTest {

	public static void main(String[] args) {
	
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 25));
		persons.add(new Person("김춘추", 23));
		persons.add(new Person("장보고", 35));
		persons.add(new Person("강감찬", 45));
		persons.add(new Person("이순신", 55));
		
		//리스트 출력(외부 반복자)
		for(Person person : persons) {
			System.out.println(person);
		}
		//스트림 출력(내부반복자)
		Stream<Person> personStream = persons.stream();// 컬렉션에 스트림 연결
		
		personStream.forEach((person)->{
			System.out.println(person);
		});
		//personStream.forEach(System.out::println);
		personStream.close();
	}
	
}
