package entities17;
/*
public class People {

	private Integer ID;
	private String nome;
	private Double salario;

	public People() {
	}

	public People(Integer iD, String nome, Double salario) {
		ID = iD;
		this.nome = nome;
		this.salario = salario;
	}

	public People(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentoSalario(Double porcentagem) {
		salario += salario * (porcentagem / 100);

	}
	
	@Override
    public String toString() {
        return "ID: " + ID + ", Nome: " + nome + ", Salário: " + String.format("%.2f", salario);
    }

}

/*
  
// * RESPOSTA VIA CHATGPT
public class People {
    private int id;
    private String nome;
    private double salario;

    // Construtor
    public People(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Método para aumentar o salário
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
        } else {
            System.out.println("Percentual de aumento deve ser positivo.");
        }
    }

    // Método para exibir informações do funcionário
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + String.format("%.2f", salario);
    }
}

*/

public class People {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public People() {
	}

	public People(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}