# bootcamp-santander
Api Restful criada para o bootcamp dio-santander

### Diagrama de Classes
```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: double
    - limit: double
  }

  class Feature {
    - icons: String
    - description: String
  }

  class Card {
    - number: String
    - limit: double
  }

  class News {
    - icons: String
    - description: String
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News

```
