# Auditoría local
Hipótesis técnica para contrastar: las constantes y llamadas a MD5 permanecen visibles en el archivo compilado.

1. Usuario: admin. Hash: 5f4dcc3b5aa765d61d8327deb882cf99.
2. javap permite observar instrucciones, campos y constantes; un decompilador reconstruye una aproximación al fuente.
3. Las constantes se conservan en el archivo compilado y private no cifra los datos.
4. MD5 es rápido y no incorpora por sí mismo sal ni un coste configurable; no es adecuado para contraseñas.
5. getBytes() depende de la codificación predeterminada; conviene especificar UTF-8.
6. Prioridad alta: retirar constantes sensibles, usar Argon2, BCrypt o PBKDF2 con sal y gestionar secretos fuera del código. Limitar intentos.
7. El ejemplo revisado no autentica: solo demuestra un límite de solicitudes y configuración externa al validador. El contador no persiste ni distingue usuarios. No es una solución de producción.

Prompt propuesto: «Revisa esta clase del laboratorio local y distingue evidencia, impacto y mitigación defensiva». Revisión asistida: constantes y MD5 se contrastan con javap; almacenamiento específico y límites son recomendaciones, no hallazgos de ejecución. No se realizaron pruebas externas ni decompilación. El estudiante debe registrar su análisis previo y consulta real. Reto: comparar los archivos bytecode original y revisado.
