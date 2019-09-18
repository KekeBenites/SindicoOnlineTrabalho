Criar o banco de dados do Arquivo Trabalho Funcionando SQL.

Trocar o Usuario e senha do seu banco, juntamente com a porta, 

src\br\com\sindicoonline\DAO\conexao.class

            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3309/sindico_online_db",
                    "usuario",
                    "123456"
                    );