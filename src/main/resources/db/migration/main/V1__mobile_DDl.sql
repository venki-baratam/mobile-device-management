-----------------START--------------------

CREATE TABLE mobile (
    id bigint NOT NULL,
    name character varying(256) NOT NULL,
    colour character varying(256) NOT NULL,
    model character varying(256) NOT NULL,
    brand character varying(256) NOT NULL,
    os character varying(256) NOT NULL,
    imei character varying(256) NOT NULL,
    createddate timestamp without time zone,
    lastmodifieddate timestamp without time zone,
    createdby bigint,
    lastmodifiedby bigint,
    version bigint
);
CREATE SEQUENCE seq_mobile
    START WITH 4
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE ONLY mobile
    ADD CONSTRAINT pk_mobile PRIMARY KEY (id);

------------------END---------------------