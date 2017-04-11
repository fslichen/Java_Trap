package evolution.forTrap.dto;

public class AnotherDto {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AnotherDto [name=" + name + "]";
	}

	public AnotherDto(String name) {
		super();
		this.name = name;
	}
}
