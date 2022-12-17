package edu.aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Eduardo");

        //relacionamento muitos telefones- criar objeto telefone
        Telefone tel = new Telefone();
        tel.setTipo("Casa");
        tel.setDdd("11");
        tel.setNumero("1111-1111");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Celular");
        tel2.setDdd("11");
        tel2.setNumero("92222-2222");

        //relacionamento tem um endereço
        // criar o objeto endereco

        Endereco end = new Endereco();
        end.setEstado("RJ");
        end.setCidade("Rio de Janeiro");
        end.setCep("11111-000");
        end.setNomeRua("Rua Sol");
        end.setNumero("11");
        end.setComplemento("-");

        System.out.println(contato.getNome());

        //criar o array de telefones para setar os telefones.
        Telefone[] telefones= new Telefone[2];
        telefones[0] = tel;
        telefones[1]= tel2;

        contato.setTelefones(telefones);
        if(contato != null && contato.getTelefones() != null){
            //pode usar qualquer repetição
            for(Telefone t: contato.getTelefones()){
                System.out.println(t.getDdd()+" "+t.getNumero());
            }
        }

        //precisa setar o objeto end
        contato.setEndereco(end);
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
    }
}
