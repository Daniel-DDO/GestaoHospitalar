# Projeto: Sistema de Gestão Hospitalar (SGH)

> **Foco:** Banco de Dados

## Descrição

O **Sistema de Gestão Hospitalar (SGH)** será uma aplicação voltada para o gerenciamento de processos clínicos, administrativos e operacionais em hospitais ou clínicas. O sistema deve ser suportado por um **banco de dados relacional robusto**, que armazenará informações críticas sobre:

- Pacientes
- Médicos
- Atendimentos (consultas)
- Internações
- Exames
- Medicamentos
- Faturamento
- Histórico de procedimentos

A arquitetura do banco de dados será cuidadosamente projetada para garantir:

- Integridade referencial
- Normalização adequada
- Consultas eficientes
- Segurança de dados médicos sensíveis

O modelo relacional incluirá tabelas interligadas por chaves primárias e estrangeiras, permitindo **consultas complexas** e **geração de relatórios em tempo real**.

Além disso, o SGH deve contemplar:

- Controle de concorrência
- Controle de acesso baseado em níveis de privilégio
- Logs de auditoria
- Backup automático
- Criptografia de dados sensíveis (ex.: histórico de saúde, documentos)

---

### Gerenciamento de Entidades

- **REQ01**: Tabelas para cadastro de pacientes (dados pessoais, endereço, contatos, convênio, histórico de doenças).  
- **REQ02**: Tabelas para médicos e profissionais (especialidade, documentos, agenda, vínculo com atendimentos).  
- **REQ03**: Tabela de usuários com controle de permissões por papéis (roles) e autenticação segura (hash de senha).  
- **REQ04**: Relacionamento entre pacientes e médicos por atendimentos vinculados (FKs), com data/hora, tipo de serviço e local.  
- **REQ05**: Tabela de leitos hospitalares, com histórico de ocupações e integração com internações.

### Prontuário Eletrônico e Atendimento

- **REQ06**: Tabela de prontuários eletrônicos (relacionamento com paciente, médico, data/hora, dados clínicos).  
- **REQ07**: Tabela de prescrições médicas (medicamentos, dosagens, horários, duração).  
- **REQ08**: Tabelas para exames clínicos (tipo, data, resultado, vínculo com laboratórios).

### Agendamento e Atendimento

- **REQ09**: Tabela de agendamentos (paciente, profissional, serviço, controle de conflitos).  
- **REQ10**: Registro de comparecimento/ausência e geração de relatórios de frequência.

### Faturamento e Financeiro

- **REQ11**: Tabela de procedimentos realizados (valores, status de cobrança, convênio/pagamento).  
- **REQ12**: Geração de faturas por paciente ou convênio (emissão, vencimento, status).  
- **REQ13**: Tabela de planos de saúde/convênios com regras de cobertura por procedimento.

### Controle de Estoque e Farmácia

- **REQ14**: Tabela de medicamentos e insumos (lote, validade, quantidade, fornecedor).  
- **REQ15**: Tabela de movimentações de estoque (entrada, saída, ajustes).  
- **REQ16**: Relacionamento entre prescrições e saída de medicamentos por paciente.

### Relatórios e Indicadores

- **REQ17**: Consultas SQL para:
  - Atendimentos por especialidade/médico
  - Internações por período
  - Ocupação média de leitos
  - Prescrições mais utilizadas

- **REQ18**: Dashboards analíticos em tempo real (views e procedures para otimização).  
- **REQ19**: Exportação de relatórios em CSV, XML e PDF.

### Segurança e Conformidade

- **REQ20**: Logs de auditoria (registro de acessos e alterações em dados sensíveis).  
- **REQ21**: Controle de permissões por perfil (ex.: médicos veem apenas seus pacientes).  
- **REQ22**: Criptografia ou mascaramento de campos sensíveis (CPF, histórico médico).  
- **REQ23**: Rotinas de backup automáticas (diárias e mensais) com versionamento.

---

## Utilizando:

- **Back-end**: Java + Spring Boot  
- **Banco de dados**: MySQL Workbench

