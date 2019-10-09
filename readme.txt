Porjeto em JAVA 8, MYSQL, utilizando o Netbens 8.2;

Segir passos abaixo.

Criar o banco de dados, utililizando o script do Arquivo Trabalho Funcionando SQL.

Trocar o Usuario e senha do seu banco, juntamente com a porta, 

Arquivo:
src\br\com\sindicoonline\DAO\conexao.class

            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3309/sindico_online_db",
                    "usuario",
                    "123456"
                    );
