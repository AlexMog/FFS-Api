ALTER TABLE `events`
ADD COLUMN `minimum_views` INT NOT NULL DEFAULT 0 AFTER `is_current`,
ADD COLUMN `minimum_followers` INT NOT NULL DEFAULT 0 AFTER `minimum_views`;
