# SmartBuild – Módulo de Análisis de Reservas (Demo DevOps/DevSecOps)

Este módulo es una demostración del proceso DevOps y DevSecOps aplicado al proyecto *SmartBuild*.  
Incluye una pequeña interfaz gráfica hecha en Java Swing que simula el análisis de reservas usando IA.

## 🚀 Características
- Aplicación Java con interfaz mínima (Swing)
- Análisis simulado de reservas
- Proceso preparado para CI/CD
- Integración con SonarQube y SonarLint
- Eliminación de credenciales en texto plano (mejora DevSecOps)

---

## 📁 Estructura del Proyecto
- src/main/java/com/smartbuild/SmartCheck.java
- sonar-project.properties
- README.md


---

## 🧪 Análisis con SonarLint (local)
1. Abrir IntelliJ
2. Instalar plugin **SonarLint**
3. Abrir cualquier archivo `.java`
4. SonarLint mostrará:
    - Bugs
    - Code smells
    - Vulnerabilidades
    - Hardcoded secrets (si existieran)

---

## 🧹 Análisis con SonarQube (opcional)
Si usas SonarQube local:

1. Ejecuta servidor SonarQube (`localhost:9000`)
2. En terminal del proyecto:
   sonar-scanner
---

## ▶️ Ejecutar la aplicación
En IntelliJ, ejecutar:
SmartCheck.main()

Aparecerá una ventana donde puedes analizar reservas.

---

## 👤 Autor
Evie Díaz – Ingeniería de Software  


