# Santander Dev Week 2024

## Diagrama de Classes

```mermaid
classDiagram
    class Usuario {
        name: string
    }
    class Conta {
        number: string
        agency: string
        balance: float
        limit: float
    }
    class Features {
        icon: string
        description: string
    }
    class Cartao {
        number: string
        limit: float
    }
    class News {
        icon: string
        description: string
    }

    Usuario "1" *--> "1" Conta : has
    Usuario "1" *--> "N"  Features : has
    Usuario  "1"  *--> "1" Cartao : has
    Usuario  "1"  *--> "N"  News : has
    
  
```
