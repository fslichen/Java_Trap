package evolution.forTrap;

import java.util.LinkedList;
import java.util.List;

import evolution.forTrap.dto.AnotherDto;
import evolution.forTrap.dto.AnyDto;

public class For {
	public static void main(String[] args) {
		AnyDto anyDto = new AnyDto();
		List<AnotherDto> anotherDtos = new LinkedList<>();
		anotherDtos.add(new AnotherDto("Chen"));
		anotherDtos.add(new AnotherDto("Ling"));
		anotherDtos.add(new AnotherDto("Bob"));
		anotherDtos.add(new AnotherDto("Holly"));
		anotherDtos.add(new AnotherDto("Sally"));
		anyDto.setAnotherDto(anotherDtos);
		// It gets AnotherDtos only once in order to improve the JVM efficiency.
		for (AnotherDto anotherDto : anyDto.getAnotherDto()) {
			System.out.println(anotherDto);
		}
	}
}
