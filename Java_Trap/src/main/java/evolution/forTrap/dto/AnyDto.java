package evolution.forTrap.dto;

import java.util.List;

public class AnyDto {
	private List<AnotherDto> anotherDtos;

	public List<AnotherDto> getAnotherDto() {
		System.out.println("About to get AnotherDtos");
		return anotherDtos;
	}

	public void setAnotherDto(List<AnotherDto> anotherDtos) {
		this.anotherDtos = anotherDtos;
	}

	@Override
	public String toString() {
		return "AnyDto [anotherDto=" + anotherDtos + "]";
	}
}
