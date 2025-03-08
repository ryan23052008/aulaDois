
public class Main {
    public static void main(String[] args) {


        Empresa empresa = new Empresa();


        Funcionario funcionario = new Funcionario();
        System.out.println(empresa.nomeEmpresa);
        System.out.println(empresa.EnderecoEmpresa);
        System.out.println(empresa.CNPJEmpresa);
        System.out.println(empresa.TipoEmpresa);


        System.out.println("O nome do funcionario é : " + empresa.nomeFuncionario);
        System.out.println("O cargo do funcionario é: " + empresa.valorSalarioFuncionario);
        System.out.println("O cargo do funcionario é: " + empresa.cargoFuncionario);

        System.out.println("salve rapaziada");

        System.out.println(777777777);


        int aumento = 120;
        int salarioFancionario = 1512;

        System.out.println();

        System.out.println(aumento + salarioFancionario);

        System.out.println(aumento - salarioFancionario);

        System.out.println(aumento * salarioFancionario); //não acontece na vida real
        System.out.println( salarioFancionario / aumento);

        System.out.println( salarioFancionario / aumento);



    }
}