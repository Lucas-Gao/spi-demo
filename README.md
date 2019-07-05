## A demo for spi

```text
.
|-- README.md
|-- pom.xml
|-- spi-implement
|-- spi-interface
`-- spi-invoke
```

#### spi-interface
interface for spi

provide a interface named Driver

function: connect


#### spi-implement
implement for spi

provide a implement class which implement Driver interface

implement function: connect


#### spi-invoke
invoke by spi

provide a class named ConnectionFactory, invoke Driver#connect by spi

