# 📱 Teste Mobile – Sauce Labs My Demo App

Projeto de automação de testes Mobile desenvolvido em **Java** utilizando **Appium**, **Cucumber BDD**, **JUnit 5**, **Maven** e **Allure Report**.

---

## 🚀 Objetivo

Demonstrar a automação de testes Mobile em aplicação Android, aplicando boas práticas de desenvolvimento, integração contínua (CI) e execução em dispositivos remotos por meio da **Device Farm Kobiton**.

**Aplicação utilizada:** [Sauce Labs My Demo App](https://github.com/saucelabs/my-demo-app-android/releases)

---

## 🧰 Tecnologias Utilizadas

- ☕ **Java 21**
- 🧩 **Maven**
- 📱 **Appium**
- 🥒 **Cucumber BDD**
- 🧪 **JUnit 5**
- 📊 **Allure Report**
- ☁️ **Kobiton – Device Farm**
- ⚙️ **GitHub Actions**

---

## 🏗️ Estrutura do Projeto

```text
portfolio_teste_mobile
│
├── src
│   ├── main
│   │   └── java
│   │       ├── config/
│   │       ├── dado/
│   │       ├── driver/
│   │       ├── factory/
│   │       ├── modelo/
│   │       ├── pages/
│   │       │   └── components/
│   │       └── validation/
│   │
│   └── test
│       ├── java
│       │   ├── hooks/
│       │   ├── runners/
│       │   └── steps/
│       │
│       └── resources
│           ├── APK/
│           ├── features/
│           ├── config.properties
│           └── allure.properties
│
├── pom.xml
└── README.md
```

---

## 🏛️ Padrões e Práticas Aplicadas

- ✔️ **Page Object Model (POM):** organização das páginas e interações com os elementos da aplicação.
- ✔️ **Page Component Pattern:** organização de componentes reutilizáveis da interface.
- ✔️ **Camada de validações:** separação das verificações funcionais em relação às ações executadas nas telas.
- ✔️ **Separação de responsabilidades:** divisão entre configuração, gerenciamento do driver, factories, modelos, páginas e testes.
- ✔️ **Massa de dados dinâmica:** apoio à criação de dados para os cenários automatizados.
- ✔️ **Configuração externa:** utilização de propriedades para parametrizar o ambiente de execução.
- ✔️ **BDD com Cucumber:** descrição dos cenários em linguagem Gherkin.
- ✔️ **Gerenciamento de sessão Appium:** inicialização e encerramento do driver durante a execução dos cenários.
- ✔️ **Execução remota:** utilização do Kobiton para executar testes em dispositivos Android.

---

## 🧩 Casos de Teste Implementados

| **Nº** | **Caso** | **Nota** |
| ------ | -------------------------------------------- | -------- |
| 1 | CT01 - Login válido | ✔️ |
| 2 | CT02 - Buscar produto específico no catálogo | ✔️ |
| 3 | CT03 - Incluir produto no carrinho | ✔️ |
| 4 | CT04 - Checkout de produto | ✔️ |

▶️ Execução do CT04 (https://portal.kobiton.com/sessions/9028806)

https://github.com/user-attachments/assets/84089b7c-462c-44cd-9a2b-0401d121ead0


---

## 📊 Relatório Allure

Relatório Allure gerado a partir da execução dos testes automatizados Mobile em dispositivo Android utilizando a **Device Farm Kobiton**.

<img width="1354" height="676" alt="Allure" src="https://github.com/user-attachments/assets/e451c35a-9391-42ac-8ac5-75945758a6de" />


---

## ⚙️ Pipeline CI/CD

O projeto utiliza o **GitHub Actions** para automatizar a execução dos testes Mobile, utilizando **variáveis secretas (Secrets)** para proteger credenciais e informações sensíveis necessárias à conexão com a **Device Farm Kobiton**.

Fluxo de execução:

```text
Push
   ↓
Checkout
   ↓
Configuração Java 21
   ↓
Execução dos Testes
   ↓
Geração dos Relatórios
```

A execução em dispositivos remotos depende das configurações e credenciais necessárias para acesso ao Kobiton.

---

## 🔎 Análise e Pendências

Os testes integrados (CI) apresentam falhas durante a execução, diferentemente quando executado por meio de comando Local.

**Pontos identificados durante a investigação:**

- ⚠️ **Interrupção da execução:** O Teste é encerrado durante a execução, os logs apresentam um comando que indica uma pausa forçada durante a execução.
<img width="1348" height="594" alt="Kill_9028837" src="https://github.com/user-attachments/assets/c162821d-52d1-4361-9ebf-fac71531a523" />

- ⚠️ **Possível incompatibilidade de versão:** em algumas execuções, são identificadas mensagens relacionadas à incompatibilidade de versões do Android.

<img width="1351" height="596" alt="Erro_9028837" src="https://github.com/user-attachments/assets/a0084e0c-261f-44e4-8966-9f12b83d8521" />

**Status:** problema em análise, com necessidade de aprofundar a investigação dos logs e identificar a causa raiz das falhas no pipeline.

---
## 👨‍💻 Autor

**Edmilson Matos Santana Júnior**

**LinkedIn:** [linkedin.com/in/edmilson-santana-3934b318b](https://linkedin.com/in/edmilson-santana-3934b318b)

