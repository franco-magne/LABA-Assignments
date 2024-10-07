CREATE DATABASE `hierarchy`;

USE hierarchy;

DROP TABLE IF EXISTS character_game;
DROP TABLE IF EXISTS character_type;
DROP TABLE IF EXISTS combo_controller_buttons;
DROP TABLE IF EXISTS controller_buttons;
DROP TABLE IF EXISTS console;
DROP TABLE IF EXISTS combo;
DROP TABLE IF EXISTS game_chapter;
DROP TABLE IF EXISTS chapter;
DROP TABLE IF EXISTS game;
DROP TABLE IF EXISTS difficulty;
DROP TABLE IF EXISTS game_status;
DROP TABLE IF EXISTS godly_possession;
DROP TABLE IF EXISTS item_magic_orbcost_powermult;
DROP TABLE IF EXISTS item_magic;
DROP TABLE IF EXISTS item_type;
DROP TABLE IF EXISTS relic;
DROP TABLE IF EXISTS weapon_orbcost_powermult;
DROP TABLE IF EXISTS weapon;

CREATE TABLE chapter (
	id_chapter INT AUTO_INCREMENT,
    name_chapter VARCHAR(50) NOT NULL,
    CONSTRAINT pk_chapter PRIMARY KEY (id_chapter)
);

-- 5 ALTER FOR chapter TABLE
	ALTER TABLE chapter ADD number_of_kinematics INT;
	ALTER TABLE chapter ADD has_boss_battle BOOLEAN;
	ALTER TABLE chapter ADD progress_completed DOUBLE DEFAULT 0.0;
	ALTER TABLE chapter ADD total_checkpoints INT;
	ALTER TABLE chapter ADD reached_checkpoints INT DEFAULT 0;

	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Beggining", 5, true, 5);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Tomb of Ares", 10, false, 8);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Poseidon", 7, true, 5);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Zeus", 10, false, 8);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Kingdom of Hades", 5, false, 4);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Judges of the Underworld", 6, false, 7);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Forge", 4, false, 3);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Palace of Hades", 8, true, 9);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The City of Olympia", 5, false, 6);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Helios", 9, true, 10);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Path of Eos", 6, false, 4);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Chain of Balance", 7, false, 5);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Caverns", 4, false, 3);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Hermes", 10, true, 8);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Heracles", 8, true, 9);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Poseidon's Chamber", 7, false, 6);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Upper Gardens", 5, true, 4);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Tartarus Pits", 6, false, 5);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Kratos vs Cronos", 9, true, 10);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Gardens of Olympus", 8, false, 7);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Labyrinth", 7, true, 9);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Encounter with Daedalus", 4, false, 5);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Heart of the Labyrinth", 10, false, 8);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Destruction of the Three Judges", 6, false, 9);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Flame of Olympus", 8, true, 7);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("Battle with Zeus", 12, true, 10);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Heart of Gaia", 5, true, 6);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("The Memories", 3, false, 4);
	INSERT INTO chapter(name_chapter, number_of_kinematics, has_boss_battle, total_checkpoints) VALUES ("In the end, there will only be chaos", 8, false, 10);


CREATE TABLE character_type (
	id_character_type INT AUTO_INCREMENT,
    name_type VARCHAR(50) NOT NULL,
    CONSTRAINT pk_character_type PRIMARY KEY (id_character_type)
);

	INSERT INTO character_type(name_type) VALUES ("Playable");
	INSERT INTO character_type(name_type) VALUES ("Boss");
	INSERT INTO character_type(name_type) VALUES ("Ordinary enemy");


CREATE TABLE character_game (
	id_character INT AUTO_INCREMENT,
    name_character VARCHAR(50) NOT NULL,
    health_bar INT,
    id_character_type INT,
    CONSTRAINT pk_character_game PRIMARY KEY (id_character),
    CONSTRAINT fk_character_game_type FOREIGN KEY (id_character_type) REFERENCES character_type(id_character_type)
);

	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Kartos", 100, 1);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Poseydon", 100, 2);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Ades", 100, 2);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Elios", 100, 2);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Ermes", 100, 2);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Ercules", 100, 2);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Kronos", 100, 2);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Escorpion", 100, 2);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Guardian de Hades", 100, 2);
	INSERT INTO character_game(name_character, health_bar, id_character_type) VALUES ("Seuz", 100, 2);

-- 10 UPDATES FOR character_game TABLE
	UPDATE character_game SET name_character = "Kratos", health_bar = 5000 WHERE (id_character = 1);
    UPDATE character_game SET name_character = "Poseidon", health_bar = 25000 WHERE (id_character = 2);
    UPDATE character_game SET name_character = "Hades", health_bar = 25000 WHERE (id_character = 3);
    UPDATE character_game SET name_character = "Helios", health_bar = 10000 WHERE (id_character = 4);
    UPDATE character_game SET name_character = "Hermes", health_bar = 10000 WHERE (id_character = 5);
    UPDATE character_game SET name_character = "Hercules", health_bar = 30000 WHERE (id_character = 6);
    UPDATE character_game SET name_character = "Cronos", health_bar = 25000 WHERE (id_character = 7);
    UPDATE character_game SET name_character = "Skorpius", health_bar = 15000 WHERE (id_character = 8);
    UPDATE character_game SET name_character = "Hades Cerberus Breeder", health_bar = 15000 WHERE (id_character = 9);
    UPDATE character_game SET name_character = "Zeus", health_bar = 50000 WHERE (id_character = 10);

CREATE TABLE console (
	id_console INT AUTO_INCREMENT,
    name_console VARCHAR(25),
    CONSTRAINT pk_console PRIMARY KEY (id_console) 
);

	INSERT INTO console(name_console) VALUES ("PS4");


CREATE TABLE controller_buttons (
	id_contr_button INT AUTO_INCREMENT,
    name_button VARCHAR(25),
    id_console INT,
    CONSTRAINT pk_controller_buttons PRIMARY KEY (id_contr_button),
    CONSTRAINT fk_controller_buttons_console FOREIGN KEY (id_console) REFERENCES console(id_console)
);

	INSERT INTO controller_buttons(name_button, id_console) VALUES ("TRIANGLE", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("CIRCLE", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("SQUARE", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("CROSS", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("L1", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("L2", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("L3", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("R1", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("R2", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("R3", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("LEFT STICK UP", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("LEFT STICK LEFT", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("LEFT STICK RIGHT", 1);
	INSERT INTO controller_buttons(name_button, id_console) VALUES ("LEFT STICK DOWN", 1);

-- 10 DELETES FOR controller_buttons TABLE
	DELETE FROM controller_buttons WHERE (id_contr_button = 5);
    DELETE FROM controller_buttons WHERE (id_contr_button = 6);
    DELETE FROM controller_buttons WHERE (id_contr_button = 7);
    DELETE FROM controller_buttons WHERE (id_contr_button = 8);
    DELETE FROM controller_buttons WHERE (id_contr_button = 9);
    DELETE FROM controller_buttons WHERE (id_contr_button = 10);
    DELETE FROM controller_buttons WHERE (id_contr_button = 11);
    DELETE FROM controller_buttons WHERE (id_contr_button = 12);
    DELETE FROM controller_buttons WHERE (id_contr_button = 13);
    DELETE FROM controller_buttons WHERE (id_contr_button = 14);


CREATE TABLE combo (
	id_combo INT AUTO_INCREMENT,
    name_combo VARCHAR(50),
    level_combo INT,
    CONSTRAINT pk_combo PRIMARY KEY (id_combo)
);

CREATE TABLE combo_controller_buttons (
	id_combo INT,
    id_contr_button INT,
    CONSTRAINT pk_combo_controller_buttons PRIMARY KEY (id_combo, id_contr_button),
    CONSTRAINT fk_combo_controller_buttons FOREIGN KEY (id_combo) REFERENCES combo(id_combo),
    CONSTRAINT fk_controller_buttons_combo FOREIGN KEY (id_contr_button) REFERENCES controller_buttons(id_contr_button)
);


CREATE TABLE difficulty (
	id_difficulty INT AUTO_INCREMENT,
    name_difficulty VARCHAR(25),
    other_name VARCHAR(25),
    damage_multiplier INT,
    CONSTRAINT pk_difficulty PRIMARY KEY (id_difficulty)
);

	INSERT INTO difficulty(name_difficulty, other_name, damage_multiplier) VALUES ("Spartan", "Easy", 1);
    INSERT INTO difficulty(name_difficulty, other_name, damage_multiplier) VALUES ("God", "Medium", 2);
    INSERT INTO difficulty(name_difficulty, other_name, damage_multiplier) VALUES ("Titan", "Hard", 3);
    INSERT INTO difficulty(name_difficulty, other_name, damage_multiplier) VALUES ("Chaos", "Very Hard", 5);


CREATE TABLE game_status (
	id_game_status INT AUTO_INCREMENT,
    descriptionn VARCHAR(25),
    timestampp VARCHAR(25),
    CONSTRAINT pk_game_status PRIMARY KEY game_status(id_game_status)
);

	INSERT INTO game_status(descriptionn, timestampp) VALUES ("Playing", " ");
    INSERT INTO game_status(descriptionn, timestampp) VALUES ("Finished", " ");
    INSERT INTO game_status(descriptionn, timestampp) VALUES ("Stopped", " ");


CREATE TABLE game (
	id_game INT AUTO_INCREMENT,
    global_progress DOUBLE,
    id_game_status INT,
    id_difficulty INT,
    CONSTRAINT pk_game PRIMARY KEY (id_game),
    CONSTRAINT fk_game_game_status FOREIGN KEY (id_game_status) REFERENCES game_status(id_game_status),
    CONSTRAINT fk_game_difficulty FOREIGN KEY (id_difficulty) REFERENCES difficulty(id_difficulty)
);

	INSERT INTO game(global_progress, id_game_status, id_difficulty) VALUES (15.0, 1, 3);
    INSERT INTO game(global_progress, id_game_status, id_difficulty) VALUES (78.6, 3, 1);
    INSERT INTO game(global_progress, id_game_status, id_difficulty) VALUES (100.0, 2, 2);
    INSERT INTO game(global_progress, id_game_status, id_difficulty) VALUES (44.2, 3, 4);


CREATE TABLE game_chapter (
	id_game INT,
    id_chapter INT,
    CONSTRAINT pk_game_chapter PRIMARY KEY (id_game, id_chapter),
    CONSTRAINT fk_game_chapter FOREIGN KEY (id_game) REFERENCES game(id_game),
    CONSTRAINT fk_chapter_game FOREIGN KEY (id_chapter) REFERENCES chapter(id_chapter)
);

	INSERT INTO game_chapter(id_game, id_chapter) VALUES (1, 1);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (1, 2);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (1, 3);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (1, 4);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (1, 5);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 1);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 2);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 3);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 4);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 5);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 6);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 7);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 8);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 9);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 10);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 11);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 12);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 13);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 14);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 15);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 16);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 17);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (2, 18);    
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 1);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 2);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 3);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 4);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 5);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 6);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 7);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 8);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 9);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 10);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 11);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 12);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 13);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 14);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 15);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 16);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 17);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 18);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 19);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 20);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 21);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 22);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 23);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 24);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 25);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 26);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 27);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 28);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (3, 29);    
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 1);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 2);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 3);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 4);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 5);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 6);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 7);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 8);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 9);
    INSERT INTO game_chapter(id_game, id_chapter) VALUES (4, 10);


CREATE TABLE godly_possession (
	id_godly_possession INT AUTO_INCREMENT,
    name_godly_possession VARCHAR(25),
    located_in VARCHAR(25),
    was_found BOOLEAN DEFAULT FALSE,
    is_activated BOOLEAN DEFAULT FALSE,
    CONSTRAINT pk_godly_possession PRIMARY KEY (id_godly_possession)
);

	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Zeus' Eagle", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Hades' Helm", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Helios' Shield", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Hermes' Coin", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Hercules' Shoulder Guard", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Poseidon's Conch Shell", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Aphrodite's Garter", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Hephaestus' Ring", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Daedalus' Schematics", " ");
	INSERT INTO godly_possession(name_godly_possession, located_in) VALUES ("Hera's Chalice", " ");


CREATE TABLE item_type (
	id_item_type INT AUTO_INCREMENT,
    name_item_type VARCHAR(25),
    current_level INT DEFAULT 1,
    CONSTRAINT pk_item_type PRIMARY KEY (id_item_type)
);

	INSERT INTO item_type(name_item_type) VALUES ("Magic");
    INSERT INTO item_type(name_item_type) VALUES ("Item");
    

CREATE TABLE item_magic (
	id_item_magic INT AUTO_INCREMENT,
    name_item_magic VARCHAR(50),
    level_item_magic INT,
    damage INT,
    cost_of_bar INT,
    id_item_type INT,
    CONSTRAINT pk_item_magic PRIMARY KEY (id_item_magic),
    CONSTRAINT fk_item_magic_item_type FOREIGN KEY (id_item_type) REFERENCES item_type(id_item_type)
);

	INSERT INTO item_magic(name_item_magic, level_item_magic, damage, cost_of_bar, id_item_type) VALUES ("Divine Reckoning", 5, 20, 15, 1);
    INSERT INTO item_magic(name_item_magic, level_item_magic, damage, cost_of_bar, id_item_type) VALUES ("Army of Sparta", 1, 10, 10, 1);
    INSERT INTO item_magic(name_item_magic, level_item_magic, damage, cost_of_bar, id_item_type) VALUES ("Soul Summon", 1, 10, 15, 1);
    INSERT INTO item_magic(name_item_magic, level_item_magic, damage, cost_of_bar, id_item_type) VALUES ("Nemean Roar", 1, 15, 20, 1);
    INSERT INTO item_magic(name_item_magic, level_item_magic, damage, cost_of_bar, id_item_type) VALUES ("Nemesis Rage", 1, 20, 20, 1);
    INSERT INTO item_magic(name_item_magic, level_item_magic, damage, cost_of_bar, id_item_type) VALUES ("Bow of Apollo", 1, 5, 5, 2);
    INSERT INTO item_magic(name_item_magic, level_item_magic, damage, cost_of_bar, id_item_type) VALUES ("Head of Helios", 1, 5, 5, 2);
    INSERT INTO item_magic(name_item_magic, level_item_magic, damage, cost_of_bar, id_item_type) VALUES ("Boots of Hermes", 1, 5, 5, 2);


CREATE TABLE item_magic_orbcost_powermult (
	id INT AUTO_INCREMENT,
    id_item_magic INT,
    orb_cost INT,
    power_multiplier INT,
    CONSTRAINT pk_item_magic_orbcost_powermult PRIMARY KEY (id),
    CONSTRAINT fk_item_magic_orbcost_powermult FOREIGN KEY (id_item_magic) REFERENCES item_magic(id_item_magic)
);

	INSERT INTO item_magic_orbcost_powermult(id_item_magic, orb_cost, power_multiplier) VALUES (6, 0, 100);
    INSERT INTO item_magic_orbcost_powermult(id_item_magic, orb_cost, power_multiplier) VALUES (6, 2500, 200);
    INSERT INTO item_magic_orbcost_powermult(id_item_magic, orb_cost, power_multiplier) VALUES (7, 0, 100);
    INSERT INTO item_magic_orbcost_powermult(id_item_magic, orb_cost, power_multiplier) VALUES (7, 2500, 300);
    INSERT INTO item_magic_orbcost_powermult(id_item_magic, orb_cost, power_multiplier) VALUES (8, 0, 100);
    INSERT INTO item_magic_orbcost_powermult(id_item_magic, orb_cost, power_multiplier) VALUES (8, 2500, 150);
    

CREATE TABLE relic (
	id_relic INT AUTO_INCREMENT,
    name_relic VARCHAR(50),
    is_equipped BOOLEAN DEFAULT FALSE,
    CONSTRAINT pk_relic PRIMARY KEY (id_relic)
);

	INSERT INTO relic(name_relic) VALUES ("Golden Fleece");
    INSERT INTO relic(name_relic) VALUES ("Icarus' Wings");
    INSERT INTO relic(name_relic) VALUES ("Poseidon's Trident");
    INSERT INTO relic(name_relic) VALUES ("Hades' Soul");
    INSERT INTO relic(name_relic) VALUES ("Boreas' Icestorm");
    INSERT INTO relic(name_relic) VALUES ("Rage of Sparta");


CREATE TABLE weapon (
	id_weapon INT AUTO_INCREMENT,
    name_weapon VARCHAR(50),
    level_weapon INT DEFAULT 1,
    damage INT,
    CONSTRAINT pk_weapon PRIMARY KEY (id_weapon)
);

	INSERT INTO weapon(name_weapon, damage) VALUES ("Blades of Exile", 20);
	INSERT INTO weapon(name_weapon, damage) VALUES ("Blade of Olympus", 100);
	INSERT INTO weapon(name_weapon, damage) VALUES ("Claws of Hades", 20);
    INSERT INTO weapon(name_weapon, damage) VALUES ("Nemean Cestus", 20);
    INSERT INTO weapon(name_weapon, damage) VALUES ("Nemesis Whip", 20);
    

CREATE TABLE weapon_orbcost_powermult (
	id INT AUTO_INCREMENT,
    id_weapon INT,
    orb_cost INT,
    power_multiplier INT,
    CONSTRAINT pk_weapon_orbcost_powermult PRIMARY KEY (id),
    CONSTRAINT fk_weapon_orbcost_powermult FOREIGN KEY (id_weapon) REFERENCES weapon(id_weapon)
);

	INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (1, 0, 100);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (1, 4000, 150);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (1, 7000, 200);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (1, 8000, 250);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (1, 10000, 300);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (3, 0, 100);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (3, 3000, 135);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (3, 5000, 160);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (3, 6000, 190);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (3, 9000, 225);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (4, 0, 100);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (4, 3000, 110);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (4, 5000, 120);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (4, 5000, 130);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (4, 8000, 140);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (5, 0, 100);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (5, 3000, 110);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (5, 5000, 120);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (5, 5000, 130);
    INSERT INTO weapon_orbcost_powermult(id_weapon, orb_cost, power_multiplier) VALUES (5, 8000, 140);


-- 5 statements with left, right, inner, outer joins

	SELECT name_item_magic, level_item_magic, damage, cost_of_bar, name_item_type FROM item_magic im
	LEFT JOIN item_type it ON (im.id_item_type = it.id_item_type);

	SELECT name_button, name_console FROM controller_buttons cb
	LEFT JOIN console c ON (cb.id_console = c.id_console);

	SELECT id_character, name_character, health_bar, name_type FROM character_game cg
	RIGHT JOIN character_type ct ON (cg.id_character_type = ct.id_character_type);

	SELECT id_game, name_difficulty, other_name, damage_multiplier FROM game g 
	RIGHT JOIN difficulty d ON (g.id_difficulty = d.id_difficulty);

	SELECT id_game, global_progress, descriptionn FROM game g
	INNER JOIN game_status gs ON (g.id_game_status = gs.id_game_status);


-- 7 statements with aggregate functions and group by and without having.

	SELECT name_weapon, damage, COUNT(wop.id) AS NumberOfUpgrades FROM weapon w
	INNER JOIN weapon_orbcost_powermult wop ON (w.id_weapon = wop.id_weapon) 
	GROUP BY name_weapon;

	SELECT name_weapon, damage, MAX(orb_cost) AS MaxOrbsNeeded FROM weapon w
	INNER JOIN weapon_orbcost_powermult wop ON (w.id_weapon = wop.id_weapon) 
	GROUP BY name_weapon;
		
	SELECT name_weapon, damage, SUM(orb_cost) AS TotalOrbsNeeded FROM weapon w
	INNER JOIN weapon_orbcost_powermult wop ON (w.id_weapon = wop.id_weapon) 
	GROUP BY name_weapon;
		
	SELECT name_weapon, damage, AVG(orb_cost) AS AverageOrbsNeeded FROM weapon w
	INNER JOIN weapon_orbcost_powermult wop ON (w.id_weapon = wop.id_weapon) 
	GROUP BY name_weapon;

	SELECT g.id_game, COUNT(id_chapter) AS ChaptersUnlocked, global_progress, name_difficulty FROM game g
	INNER JOIN difficulty d ON (g.id_difficulty = d.id_difficulty)
	INNER JOIN game_chapter gc ON (g.id_game = gc.id_game)
	GROUP BY gc.id_game;
        
	SELECT g.id_game, MAX(id_chapter) AS LastChapterUnlocked, global_progress, name_difficulty FROM game g
	INNER JOIN difficulty d ON (g.id_difficulty = d.id_difficulty)
	INNER JOIN game_chapter gc ON (g.id_game = gc.id_game)
	GROUP BY gc.id_game;

	SELECT IF(has_boss_battle = 1, 'TRUE', 'FALSE') AS has_boss_battle, COUNT(id_chapter) AS NumberOfChapters FROM chapter
    GROUP BY has_boss_battle;


-- 7 statements with aggregate functions and group by and with having.

	SELECT name_weapon, damage, COUNT(wop.id) AS NumberOfUpgrades FROM weapon w
	INNER JOIN weapon_orbcost_powermult wop ON (w.id_weapon = wop.id_weapon) 
	GROUP BY name_weapon
	HAVING (damage > 10);
    
	SELECT wop.id_weapon, name_weapon, SUM(orb_cost) AS TotalOrbsNeeded FROM weapon_orbcost_powermult wop
	INNER JOIN weapon w ON (wop.id_weapon = w.id_weapon)
	GROUP BY wop.id_weapon
	HAVING SUM(orb_cost) < 25000;

	SELECT wop.id_weapon, name_weapon, AVG(power_multiplier) AS AveragePowerMultiplier FROM weapon_orbcost_powermult wop
	INNER JOIN weapon w ON (wop.id_weapon = w.id_weapon)
	GROUP BY wop.id_weapon
	HAVING AVG(power_multiplier) > 150;
    
	SELECT g.id_game, COUNT(id_chapter) AS ChaptersUnlocked, global_progress, name_difficulty FROM game g
	INNER JOIN difficulty d ON (g.id_difficulty = d.id_difficulty)
	INNER JOIN game_chapter gc ON (g.id_game = gc.id_game)
	GROUP BY gc.id_game
    HAVING (global_progress > 50);
    
    SELECT g.id_game, COUNT(id_chapter) AS ChaptersUnlocked, global_progress, name_difficulty FROM game g
	INNER JOIN difficulty d ON (g.id_difficulty = d.id_difficulty)
	INNER JOIN game_chapter gc ON (g.id_game = gc.id_game)
	GROUP BY gc.id_game
    HAVING (global_progress = 100);
    
    SELECT g.id_game, COUNT(id_chapter) AS ChaptersUnlocked, global_progress, name_difficulty FROM game g
	INNER JOIN difficulty d ON (g.id_difficulty = d.id_difficulty)
	INNER JOIN game_chapter gc ON (g.id_game = gc.id_game)
	GROUP BY gc.id_game
    HAVING COUNT(id_chapter) > 5;
    
    SELECT total_checkpoints, COUNT(id_chapter) AS NumberOfChapters FROM chapter
    GROUP BY total_checkpoints
    HAVING (total_checkpoints > 6);
