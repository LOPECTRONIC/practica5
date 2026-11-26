# Cuenta digital
| Prueba | Esperado |
|---|---|
| Depósito 100 | true, 1100 |
| Retiro 200 | true, 900 |
| Depósito 0 | false, 900 |
| Retiro 1000 | false, 900 |
| Retiro 400 | false, 900 |
El saldo se modifica únicamente mediante operaciones validadas. Reto Easy: límite de 500 por jornada simulada (una ejecución).
