CREATE DATABASE `hierarchy`;

USE hierarchy;

CREATE TABLE chapter (
	id_chapter INT AUTO_INCREMENT,
    name_chapter VARCHAR(50),
    number_of_kinematics INT,
    has_boss_battle BOOLEAN,
    progress_completed DOUBLE,
    total_checkpoints INT,
    reached_chechpoints INT,
    CONSTRAINT pk_chapter PRIMARY KEY (id_chapter)
);

CREATE TABLE character_type (
	id_character_type INT AUTO_INCREMENT,
    name_type VARCHAR(50),
    CONSTRAINT pk_character_type PRIMARY KEY (id_character_type)
);

CREATE TABLE character_game (
	id_character INT AUTO_INCREMENT,
    name_character VARCHAR(50),
    health_bar INT,
    id_character_type INT,
    CONSTRAINT pk_character_game PRIMARY KEY (id_character),
    CONSTRAINT fk_character_game_type FOREIGN KEY (id_character_type) REFERENCES character_type(id_character_type)
);

CREATE TABLE console (
	id_console INT AUTO_INCREMENT,
    name_console VARCHAR(25),
    CONSTRAINT pk_console PRIMARY KEY (id_console) 
);

CREATE TABLE controller_buttons (
	id_contr_button INT AUTO_INCREMENT,
    name_button VARCHAR(25),
    id_console INT,
    CONSTRAINT pk_controller_buttons PRIMARY KEY (id_contr_button),
    CONSTRAINT fk_controller_buttons_console FOREIGN KEY (id_console) REFERENCES console(id_console)
);

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

CREATE TABLE game_status (
	id_game_status INT AUTO_INCREMENT,
    descriptionn VARCHAR(25),
    timestampp VARCHAR(25),
    CONSTRAINT pk_game_status PRIMARY KEY game_status(id_game_status)
);

CREATE TABLE game (
	id_game INT AUTO_INCREMENT,
    global_progress DOUBLE,
    id_game_status INT,
    id_difficulty INT,
    CONSTRAINT pk_game PRIMARY KEY (id_game),
    CONSTRAINT fk_game_game_status FOREIGN KEY (id_game_status) REFERENCES game_status(id_game_status),
    CONSTRAINT fk_game_difficulty FOREIGN KEY (id_difficulty) REFERENCES difficulty(id_difficulty)
);

CREATE TABLE godly_possession (
	id_godly_possession INT AUTO_INCREMENT,
    name_godly_possession VARCHAR(25),
    located_in VARCHAR(25),
    was_found BOOLEAN,
    is_activated BOOLEAN,
    CONSTRAINT pk_godly_possession PRIMARY KEY (id_godly_possession)
);

CREATE TABLE item_type (
	id_item_type INT AUTO_INCREMENT,
    name_item_type VARCHAR(25),
    current_level INT,
    CONSTRAINT pk_item_type PRIMARY KEY (id_item_type)
);

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

CREATE TABLE item_magic_orbcost_powermult (
	id INT AUTO_INCREMENT,
    id_item_magic INT,
    orb_cost INT,
    power_multiplier INT,
    CONSTRAINT pk_item_magic_orbcost_powermult PRIMARY KEY (id),
    CONSTRAINT fk_item_magic_orbcost_powermult FOREIGN KEY (id_item_magic) REFERENCES item_magic(id_item_magic)
);

CREATE TABLE relic (
	id_relic INT AUTO_INCREMENT,
    name_relic VARCHAR(50),
    is_equipped BOOLEAN,
    CONSTRAINT pk_relic PRIMARY KEY (id_relic)
);

CREATE TABLE weapon (
	id_weapon INT AUTO_INCREMENT,
    name_weapon VARCHAR(50),
    level_weapon INT,
    damage INT,
    CONSTRAINT pk_weapon PRIMARY KEY (id_weapon)
);

CREATE TABLE weapon_orbcost_powermult (
	id INT AUTO_INCREMENT,
    id_weapon INT,
    orb_cost INT,
    power_multiplier INT,
    CONSTRAINT pk_weapon_orbcost_powermult PRIMARY KEY (id),
    CONSTRAINT fk_weapon_orbcost_powermult FOREIGN KEY (id_weapon) REFERENCES weapon(id_weapon)
);
