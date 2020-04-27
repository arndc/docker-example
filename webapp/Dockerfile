FROM node:lts-alpine as build
WORKDIR /home/app/webapp

COPY babel.config.js .
COPY public ./public/
COPY package.json .
RUN yarn install
COPY src ./src/
RUN yarn build

FROM node:lts-alpine
RUN npm install -g http-server
COPY --from=build /home/app/webapp/dist /opt/app/webapp
EXPOSE 8080
ENTRYPOINT ["http-server", "/opt/app/webapp"]