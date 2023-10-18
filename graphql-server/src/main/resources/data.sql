INSERT INTO `fabricante` (`id_fabricante`, `nome`, `cidade`, `estado`, `categoria`) VALUES
(1,	'Panco', 'São Paulo', 'SP', 'ALIMENTICIO'),
(2,	'Nestle', 'Rio de Janeiro', 'RJ', 'ALIMENTICIO'),
(3,	'Elite', 'Belo Horizonte', 'MG', 'HOSPITALAR'),
(4,	'Pirelli', 'Rio Grande do Sul', 'RS', 'AUTOMOTIVO');


INSERT INTO `produto` (`id_produto`, `nome`, `data_validade`,  `lote`, `fabricante_id_fabricante`) VALUES
(1,	'Panetone', '2022-02-05', '42L', 1),
(2,	'Bolacha', '2021-02-10', '50R', 1),
(3,	'Salgadinho', '2022-10-20', '23F', 4),
(4,	'Chocolate', '2022-03-12', '10R', 2),
(5,	'Bolo', '2021-12-20', '900G', 2),
(6,	'Luva Cirurgica', '2024-04-10', '77B', 3),	
(7,	'Pneu', '2028-10-10', '720R', 4);